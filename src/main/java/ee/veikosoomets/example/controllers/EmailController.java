package ee.veikosoomets.example.controllers;

import ee.veikosoomets.example.services.MailService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;
import java.util.List;

@RestController
public class EmailController {

    private MailService mailService;

    public EmailController(MailService mailService) {
        this.mailService = mailService;
    }

    @PostMapping(value = "/sendemail")
    public String sendEmail(@RequestBody String infulencer, String brand) throws MessagingException {
        mailService.sendmail(infulencer, brand);
        mailService.sendmail(brand, infulencer);
        return "Email sent successfully";
    }
}