package ee.veikosoomets.example.controllers;

import ee.veikosoomets.example.entities.Campaign;
import ee.veikosoomets.example.entities.User;
import ee.veikosoomets.example.repository.CampaignRepository;
import ee.veikosoomets.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class ExampleController {


    @GetMapping("/hello-world")
    public String getHelloWorld() {
        return "Hello world";
    }


}
