package api.model;

import org.hibernate.annotations.IndexColumn;
import org.hibernate.annotations.ListIndexBase;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Category {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private String key;
    private String name;

    @OneToMany
    @JoinColumn(name = "category_id")
    private Set<Achievement> achievements;

    protected Category() {}

    public Category(
            long id,
            String key,
            String name,
            Set<Achievement> achievements
    ) {
        this.id = id;
        this.key = key;
        this.name = name;
        this.achievements = achievements;
    }

    public long getId() {
        return id;
    }

    public String getKey() {
        return key;
    }

    public String getName() {
        return name;
    }

    public Set<Achievement> getAchievements() {
        return achievements;
    }
}