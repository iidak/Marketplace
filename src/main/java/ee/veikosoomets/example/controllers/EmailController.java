package ee.veikosoomets.example.controllers;

import ee.veikosoomets.example.services.EmailService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;
import java.util.List;

@RestController
public class EmailController {

    private EmailService emailService;

    public EmailController(EmailService emailService) {
        this.emailService = emailService;
    }

    @PostMapping(value = "/sendemail")
    public String sendEmail(@RequestBody List<String> recipients) throws MessagingException {
        for (String recipient: recipients) {
            emailService.sendmail(recipient);
        }
        return "Email sent successfully";
    }
}