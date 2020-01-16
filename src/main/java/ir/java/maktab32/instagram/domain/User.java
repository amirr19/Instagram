package ir.java.maktab32.instagram.domain;

import ir.java.maktab32.instagram.config.PersistenceEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
public class User extends PersistenceEntity<Long> {
    private String userName;
    private String password;

    @ElementCollection
    private List<String> followings = new ArrayList<>();
    @ElementCollection
    private List<String> followers = new ArrayList<>();

}
