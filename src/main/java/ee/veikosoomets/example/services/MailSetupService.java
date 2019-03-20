package ee.veikosoomets.example.services;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

class MailSetupService {

    Message mailSetup(String recipient) throws MessagingException {
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
        return msg;
    }

}
