package ee.veikosoomets.example.controllers;

import ee.veikosoomets.example.entities.Email;
import ee.veikosoomets.example.entities.VerificationCode;
import ee.veikosoomets.example.repository.VerificationRepository;
import ee.veikosoomets.example.services.MailService;
import ee.veikosoomets.example.services.MailVerificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@CrossOrigin
@RestController
public class EmailController {

    @Autowired
    private MailService mailService;
    @Autowired
    private MailVerificationService mailVerificationService;
    @Autowired
    private VerificationRepository verificationRepository;

    public EmailController(MailService mailService, MailVerificationService mailVerificationService,
                           VerificationRepository verificationRepository) {
        this.mailService = mailService;
        this.mailVerificationService = mailVerificationService;
        this.verificationRepository = verificationRepository;
    }

    @PostMapping(value = "/sendemail")
    public String sendEmail(@RequestBody Email email) throws MessagingException {
        if (email.getSocial().equals("")) {
            mailService.sendmail(email.getBrand(), email.getInfluencer());
        } else {
            mailService.sendmail(email.getBrand(), email.getInfluencer(), email.getSocial());
        }
        mailService.sendmail(email.getInfluencer(), email.getBrand());
        return "Email sent successfully";
    }

    @PostMapping(value = "/veremail")
    public int verificationEmail(@RequestBody VerificationCode verificationCode) throws MessagingException {
        int min = 1000;
        int max = 9999;
        int code = ThreadLocalRandom.current().nextInt(min, max + 1);
        verificationCode.setCode(code);
        mailVerificationService.sendVerificationMail(verificationCode);
        verificationRepository.save(verificationCode);
        return code;
    }

    @PostMapping(value = "/checkver")
    public boolean checkVerification(@RequestBody VerificationCode verificationCodeToBeChecked) {
        List<VerificationCode> verificationCodes = verificationRepository.findAll();
        for (VerificationCode verificationCode: verificationCodes) {
            if (verificationCodeToBeChecked.getEmail().equals(verificationCode.getEmail())) {
                if (verificationCode.getCode() == verificationCodeToBeChecked.getCode()) {
                    verificationRepository.delete(verificationCode);
                    return true;
                }
            }
        }
        return false;
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
