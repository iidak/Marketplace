package ee.veikosoomets.example.controllers;

import ee.veikosoomets.example.entities.Email;
import ee.veikosoomets.example.services.MailService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;
import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
public class EmailController {

    private MailService mailService;

    public EmailController(MailService mailService) {
        this.mailService = mailService;
    }

    @PostMapping(value = "/sendemail")
    public String sendEmail(@RequestBody Email email) throws MessagingException {
        mailService.sendmail(email.getInfluencer(), email.getBrand());
        mailService.sendmail(email.getBrand(), email.getInfluencer());
        return "Email sent successfully";
    }

    /*

    static class PostParam {

        private String influencer;
        private String brand;

        private PostParam() {}

        public String getInfluencer() {
            return influencer;
        }

        public String getBrand() {
            return brand;
        }
    }*/
}