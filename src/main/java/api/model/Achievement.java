package api.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Achievement {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    private int points;
    private String img;
    private String title;
    private String key;
    @OneToMany
    @JoinColumn(name = "achievement_id", referencedColumnName = "id")
    private Set<Task> tasks;
    private Boolean completed;

    protected Achievement() {}

    public Achievement(
            String key,
            String title,
            Set<Task> tasks,
            String img,
            int points,
            Boolean completed
    ) {
        this.key = key;
        this.title = title;
        this.points = points;
        this.img = img;
        this.tasks = tasks;
        this.completed = completed;
    }

    public int getPoints() {
        return points;
    }

    public String getImg() {
        return img;
    }

    public String getTitle() {
        return title;
    }

    public String getKey() {
        return key;
    }

    public Set<Task> getTasks() { return this.tasks; }

    public Boolean getCompleted() {
        return completed;
    }
}
