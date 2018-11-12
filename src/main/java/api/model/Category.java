package api.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Category {

    @Id
    private String key;
    private String name;

    @OneToMany
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    private Set<Achievement> achievements;

    protected Category() {}

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

    public String getName() {
        return name;
    }

    public Set<Achievement> getAchievements() {
        return achievements;
    }
}