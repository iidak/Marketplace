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
public class Campaign {

    private @Id @GeneratedValue Long id;
    private Brand brand;
    private String title;
    private String description;
    private Audience audience;

    public Campaign(Brand brand, String title, String description) {
        this.brand = brand;
        this.title = title;
        this.description = description;
    }
}
