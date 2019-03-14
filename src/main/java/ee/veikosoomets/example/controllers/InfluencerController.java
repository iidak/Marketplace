package ee.veikosoomets.example.controllers;

import ee.veikosoomets.example.entities.Influencer;
import ee.veikosoomets.example.entities.User;
import ee.veikosoomets.example.repository.InfluencerRepository;
import ee.veikosoomets.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class InfluencerController {

    @Autowired
    private final UserRepository userRepository;
    @Autowired
    private final InfluencerRepository influencerRepository;

    public InfluencerController(UserRepository userRepository, InfluencerRepository influencerRepository) {
        this.influencerRepository = influencerRepository;
        this.userRepository = userRepository;
    }

    @PostMapping("/getInfluencer")
    public Influencer getInfluencer(@RequestBody Influencer influencer) {
        userRepository.save(influencer);
        return influencerRepository.save(influencer);
    }

    @GetMapping("/getInfluencers")
    public List<Influencer> getAllInfluencers() {
        return influencerRepository.findAll();
    }
}
