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
    private String body;

    public Campaign(String title, String body) {
        this.title = title;
        this.body = body;
    }
}
