package ee.veikosoomets.example.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Campaign {

    private @Id @GeneratedValue Long id;
    @OneToOne
    private Brand brand;
    private String title;
    private String description;
    private String email;
    private String brandName;
    @OneToOne
    private Audience audience;
    @OneToMany
    private List<Offer> offers;

    public Campaign(Brand brand, String title, String description, Audience audience, List<Offer> offers) {
        this.brand = brand;
        this.title = title;
        this.description = description;
        this.audience = audience;
        this.offers = offers;
    }

    public Campaign(String title, String description, String email, String brandName) {
        this.title = title;
        this.description = description;
        this.email = email;
        this.brandName = brandName;
    }
}
