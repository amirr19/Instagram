package ir.java.maktab32.instagram.domain.post;

import ir.java.maktab32.instagram.config.PersistenceEntity;
import ir.java.maktab32.instagram.config.hibernate.repositories.CrudRepo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
public class Post extends PersistenceEntity<Long>{

    @OneToMany
    private String comment;
    private String title;
    private List postListSource = new ArrayList();
    private Long likeCount;
    private String description;

}
