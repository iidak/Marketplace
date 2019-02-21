package ee.veikosoomets.example.controllers;

import ee.veikosoomets.example.entities.User;
import ee.veikosoomets.example.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

    private final UserRepository repository;

    ExampleController(UserRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/hello-world")
    public String getHelloWorld() {
        return "Hello world";
    }

    @PostMapping("/input")
    public User getInput(String input) {
        return repository.save(new User(input, "person"));
    }

    @GetMapping("/role")
    public User getRole(@PathVariable Long id) {
        return repository.findById(id).orElseThrow(RuntimeException::new);
    }
}