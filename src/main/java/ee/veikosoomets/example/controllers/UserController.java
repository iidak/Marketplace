package ee.veikosoomets.example.controllers;

import ee.veikosoomets.example.entities.User;
import ee.veikosoomets.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class UserController {

    @Autowired
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
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
