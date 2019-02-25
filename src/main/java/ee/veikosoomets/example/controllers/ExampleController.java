package ee.veikosoomets.example.controllers;

import ee.veikosoomets.example.entities.User;
import ee.veikosoomets.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ExampleController {

    @Autowired
    private final UserRepository repository;

    ExampleController(UserRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/hello-world")
    public String getHelloWorld() {
        return "Hello world";
    }

    @PostMapping("/input")
    public User getInput(@RequestBody User user) {
        return repository.save(user);
    }

    @GetMapping("/role/{id}")
    public User getRole(@PathVariable Long id) {
        return repository.findById(id).orElseThrow(RuntimeException::new);
    }

    @GetMapping("/role")
    public User getRoleById(@RequestParam() Long id) {
        return repository.findById(id).orElseThrow(RuntimeException::new);
    }

    @GetMapping("/roles")
    public List<User> getAll() {
        return repository.findAll();
    }
}
