package api.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Set;

@Entity
public class Task {

    @Id
    private long id;
    private String description;
    private Boolean completed;

    public Boolean getCompleted() {
        return completed;
    }

    public String getDescription() {
        return description;
    }
}
