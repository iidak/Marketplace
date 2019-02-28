package ee.veikosoomets.example.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.AbstractMap;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Audience {

    private @Id @GeneratedValue Long id;
    enum Location { GLOBAL, ESTONIA }
    enum Gender { FEMALE, MALE, BOTH }
    private Location location;
    private AbstractMap.SimpleEntry age;
    private Gender gender;

    public Audience(Location location, AbstractMap.SimpleEntry age, Gender gender) {
        this.location = location;
        this.age = age;
        this.gender = gender;
    }
}
