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
public class User {

    private @Id @GeneratedValue Long id;
    private String name;
    private String role = "tere";

    public User(String name) {
        this.name = name;
    }

    /*@Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", role='" + role + '\'' +
                '}';
    }*/
}
