package FamilyAssistance.post;


import javax.persistence.Entity;

@Entity
public class Post {

    String title;
    String description;

    String stage;
    String user_id;

    public Post() {

    }

    public Post(String title, String description, String stage, String user_id) {
        this.title = title;
        this.description = description;
        this.stage = stage;
        this.user_id = user_id;
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
}
