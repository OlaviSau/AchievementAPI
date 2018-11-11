package api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Achievement {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private int points;
    private String img;
    private String title;
    private String key;
    private String description;
    private Boolean completed;

    protected Achievement() {}

    public Achievement(
            long id,
            String key,
            String title,
            String description,
            String img,
            int points,
            Boolean completed
    ) {
        this.id = id;
        this.key = key;
        this.title = title;
        this.points = points;
        this.img = img;

        this.description = description;
        this.completed = completed;
    }

    public long getId() {
        return id;
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

    public String getDescription() {
        return description;
    }

    public Boolean getCompleted() {
        return completed;
    }
}
