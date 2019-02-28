package ee.veikosoomets.example.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Influencer extends User {

    private String instagram;
    private String youtube;
    @OneToOne
    private Audience audience;

    public Influencer(String email, String password, String firstName, String lastName, String instagram, String youtube, Audience audience) {
        super(email, password, firstName, lastName);
        this.instagram = instagram;
        this.youtube = youtube;
        this.audience = audience;
    }
}
