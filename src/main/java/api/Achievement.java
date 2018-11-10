package api;

public class Achievement {

    private final long id;
    private final int points;
    private final String img;
    private final String title;
    private final String key;
    private final String description;
    private final Boolean completed;

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
