package ee.veikosoomets.example.tests;

import ee.veikosoomets.example.controllers.CampaignController;
import ee.veikosoomets.example.entities.Campaign;
import ee.veikosoomets.example.repository.CampaignRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.Access;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class CampaignControllerTest {

    @MockBean
    CampaignRepository campaignRepository;

    @Autowired
    CampaignController campaignController;

    Campaign campaign = new Campaign("Test", "Test desc", "emai@email.com", "brand", "photourl");
    Campaign campaign1 = new Campaign("Test", "Test desc", "emai@email.com", "brand", "photourl");
    // Testing if campaigns can be added and retrieved
    @Test
    public void addCampaign() {

        campaignRepository.save(campaign);
        campaignRepository.save(campaign1);
        Assert.assertEquals(2, campaignRepository.findAll().size());

    }

    @Test
    public void getAllCampaigns() {
        campaignRepository.save(campaign);
        campaignRepository.save(campaign1);
        Assert.assertEquals(2, campaignRepository.findAll().size());
    }
}