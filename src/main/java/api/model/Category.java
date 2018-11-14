package api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Category {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;

    @JsonIgnore
    private String key;
    private String name;

    @OneToMany
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    private Set<Achievement> achievements;

    public Category() {}

    public Category(
            String key,
            String name,
            Set<Achievement> achievements
    ) {
        this.key = key;
        this.name = name;
        this.achievements = achievements;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) { this.key = key; }

    public String getName() {
        return name;
    }

    public void setName(String name) { this.name = name; }

    public Set<Achievement> getAchievements() {
        return achievements;
    }

    public long getId() { return id; }
}