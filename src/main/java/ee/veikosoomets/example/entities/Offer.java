package ee.veikosoomets.example.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Offer {

    private @Id @GeneratedValue Long id;
    @OneToOne
    private Campaign campaign;
    @OneToOne
    private Influencer influencer;
    enum Status { SENT, ACCEPTED, MATCHED, DECLINED }
    private Status status;

    public Offer(Campaign campaign, Influencer influencer) {
        this.campaign = campaign;
        this.influencer = influencer;
        this.status = Status.SENT;
    }

    public void influencerAccepted() {
        status = Status.ACCEPTED;
    }

    public void brandAccepted() {
        status = Status.MATCHED;
    }

    public void offerDeclined() {
        status = Status.DECLINED;
    }



}
