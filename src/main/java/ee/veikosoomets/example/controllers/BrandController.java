package ee.veikosoomets.example.controllers;

import ee.veikosoomets.example.entities.Brand;
import ee.veikosoomets.example.entities.Influencer;
import ee.veikosoomets.example.entities.User;
import ee.veikosoomets.example.repository.BrandRepository;
import ee.veikosoomets.example.repository.InfluencerRepository;
import ee.veikosoomets.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class BrandController {

    @Autowired
    private final UserRepository userRepository;
    @Autowired
    private final BrandRepository brandRepository;

    public BrandController(UserRepository userRepository, BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
        this.userRepository = userRepository;
    }

    @PostMapping("/getBrand")
    public Brand getBrand(@RequestBody Brand brand) {
        userRepository.save(brand);
        return brandRepository.save(brand);
    }

    @GetMapping("/getBrands")
    public List<Brand> getAllBrands() {
        return brandRepository.findAll();
    }
}
