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
public class VerificationCode {

    private @Id
    @GeneratedValue
    Long id;
    private int code;
    private String email;

    public VerificationCode(int code, String email) {
        this.code = code;
        this.email = email;
    }

    public VerificationCode(String email) {
        this.email = email;
    }
}
