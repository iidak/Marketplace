package ee.veikosoomets.example.controllers;

import ee.veikosoomets.example.entities.Campaign;
import ee.veikosoomets.example.repository.CampaignRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class CampaignController {

    @Autowired
    private final CampaignRepository campaignRepository;

    public CampaignController(CampaignRepository campaignRepository) {
        this.campaignRepository = campaignRepository;
    }


    @PostMapping("/addCampaign")
    public Campaign addCampaign(@RequestBody Campaign campaign) {
        return campaignRepository.save(campaign);
    }

    @GetMapping("/getCampaigns")
    public List<Campaign> getAllCampaigns() {
        return campaignRepository.findAll();
    }

}
