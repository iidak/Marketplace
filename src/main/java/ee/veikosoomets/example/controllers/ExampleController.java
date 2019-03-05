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

    @Autowired
    private final UserRepository userRepository;


    ExampleController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/hello-world")
    public String getHelloWorld() {
        return "Hello world";
    }

    @PostMapping("/input")
    public User getInput(@RequestBody User user) {
        return userRepository.save(user);
    }

    @GetMapping("/role/{id}")
    public User getRole(@PathVariable Long id) {
        return userRepository.findById(id).orElseThrow(RuntimeException::new);
    }

    @GetMapping("/role")
    public User getRoleById(@RequestParam() Long id) {
        return userRepository.findById(id).orElseThrow(RuntimeException::new);
    }

    @GetMapping("/roles")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

}
