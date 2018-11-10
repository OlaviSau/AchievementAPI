package api;

public class Category {

    private final long id;
    private final String key;
    private final String name;
    private Achievement[] achievements;

    public Category(
            long id,
            String key,
            String name,
            Achievement[] achievements
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

    public Achievement[] getAchievements() {
        return achievements;
    }
}