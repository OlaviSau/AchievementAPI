package api.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Achievement {

    private int points;
    private String img;
    private String title;
    @Id
    private String key;
    private String description;
    private Boolean completed;

    protected Achievement() {}

    public Achievement(
            String key,
            String title,
            String description,
            String img,
            int points,
            Boolean completed
    ) {
        this.key = key;
        this.title = title;
        this.points = points;
        this.img = img;

        this.description = description;
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

    public String getDescription() {
        return description;
    }

    public Boolean getCompleted() {
        return completed;
    }
}
