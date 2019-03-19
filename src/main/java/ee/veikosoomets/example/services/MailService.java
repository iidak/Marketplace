package ee.veikosoomets.example.services;

import org.springframework.stereotype.Service;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Date;
import java.util.Properties;

@Service
public class MailService {

    public void sendmail(String recipient, String content) throws MessagingException {
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("marketplaceinfluencers@gmail.com", "Marketplace123");
            }
        });
        Message msg = new MimeMessage(session);
        msg.setFrom(new InternetAddress("marketplaceinfluencers@gmail.com", false));

        msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipient));
        msg.setSubject("We found you a match!");
        String emailContent = "Hey! We found you a business contact! Your contact's email is: " + content;
        msg.setContent(emailContent, "text/html");
        msg.setSentDate(new Date());
        Transport.send(msg);
    }
}