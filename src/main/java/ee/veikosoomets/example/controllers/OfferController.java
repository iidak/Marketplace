package ee.veikosoomets.example.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("message")
public class OfferController {

    @GetMapping
    public String list() {
        return "something";
    }


}
