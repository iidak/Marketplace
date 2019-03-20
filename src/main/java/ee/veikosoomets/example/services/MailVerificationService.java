package ee.veikosoomets.example.services;

import ee.veikosoomets.example.entities.VerificationCode;
import org.springframework.stereotype.Service;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Transport;
import java.util.Date;

@Service
public class MailVerificationService {

    private MailSetupService mailSetupService = new MailSetupService();

    public void sendVerificationMail(VerificationCode verificationCode) throws MessagingException {
        Message msg = mailSetupService.mailSetup(verificationCode.getEmail());
        msg.setSubject("Email verification");
        String emailContent = "Hey! To verify your email address, insert the following code to the required field: " + verificationCode.getCode();
        msg.setContent(emailContent, "text/html");
        msg.setSentDate(new Date());
        Transport.send(msg);
    }
}
