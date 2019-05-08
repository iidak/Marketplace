package ee.veikosoomets.example.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Email {

    private @Id
    @GeneratedValue
    Long id;
    private String brand;
    private String influencer;
    private String social = "";

    public Email(String brand, String influencer) {
        this.brand = brand;
        this.influencer = influencer;
    }
    public Email(String brand, String influencer, String social) {
        this.brand = brand;
        this.influencer = influencer;
        this.social = social;
    }


}
