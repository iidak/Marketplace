package ee.veikosoomets.example.services;

import org.springframework.stereotype.Service;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Transport;
import java.util.Date;

@Service
public class MailService {

    private MailSetupService mailSetupService = new MailSetupService();

    public void sendmail(String recipient, String content) throws MessagingException {
        Message msg = mailSetupService.mailSetup(recipient);
        msg.setSubject("We found you a match!");
        String emailContent = "Hey! We found you a business contact! Your contact's email is: " + content;
        msg.setContent(emailContent, "text/html");
        msg.setSentDate(new Date());
        Transport.send(msg);
    }
}