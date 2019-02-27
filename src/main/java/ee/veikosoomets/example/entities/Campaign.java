package ee.veikosoomets.example.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
@AllArgsConstructor
public class Campaign {

    private @Id @GeneratedValue Long id;
    private String title;
    private String body;

}
