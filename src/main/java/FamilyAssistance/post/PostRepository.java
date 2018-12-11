package FamilyAssistance.post;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends Repository {

    List<Post> findByUser_idAndAndStage(String user_id, String stage);
}
