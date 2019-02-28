package ee.veikosoomets.example.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Offer {

    Campaign campaign;
    Influencer influencer;
    enum Status { SENT, ACCEPTED, MATCHED, DECLINED }
    Status status;

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
