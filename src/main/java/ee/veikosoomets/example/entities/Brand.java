package ee.veikosoomets.example.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Brand extends User {

    private String businessName;

    public Brand(String email, String password, String firstName, String lastName, String businessName) {
        super(email, password, firstName, lastName);
        this.businessName = businessName;
    }
}
