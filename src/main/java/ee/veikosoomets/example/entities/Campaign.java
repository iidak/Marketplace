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
    private String title;
    private String description;
    private String email;
    private String brandName;
    private String photo;

    public Campaign(String title, String description, String email, String brandName, String photo) {
        this.title = title;
        this.description = description;
        this.email = email;
        this.brandName = brandName;
        this.photo = photo;
    }
}
