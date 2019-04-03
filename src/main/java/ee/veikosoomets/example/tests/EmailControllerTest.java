package ee.veikosoomets.example.tests;

import ee.veikosoomets.example.controllers.EmailController;
import ee.veikosoomets.example.entities.Email;
import ee.veikosoomets.example.entities.VerificationCode;
import ee.veikosoomets.example.repository.VerificationRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import javax.mail.MessagingException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmailControllerTest {

    @MockBean
    VerificationRepository verificationRepository;

    @Autowired
    EmailController emailController;

    Email email = new Email("nilstirs@gmail.com", "nitirs@ttu.ee");
    VerificationCode verificationCode = new VerificationCode(1234, "nilstirs@gmail.com");


    public boolean isInt(int input) {
        return input < 9999;
    }



    // Testing if the emails are sent, if it doesn't reach the return function the email isn't sent
    @Test
    public void sendEmail() throws MessagingException {

        Assert.assertEquals("Email sent successfully", emailController.sendEmail(email));
    }
    // Testing if the verification emails are sent, since a code won't be returned if it fails
    @Test
    public void verificationEmail() throws MessagingException {

        Assert.assertEquals(true, isInt(emailController.verificationEmail(verificationCode)));

    }
    int code = 1234;
    @Test
    public void checkVerification() {

        verificationRepository.save(verificationCode);
        Assert.assertEquals(true, emailController.checkVerification(verificationCode));
    }
}