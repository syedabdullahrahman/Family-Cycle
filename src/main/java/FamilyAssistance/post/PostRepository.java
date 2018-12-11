package FamilyAssistance.post;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends CrudRepository<Post, Long> {

    default List<Post> findByUser_idAndAndStage(String user_id, String stage) {
        return null;
    }
}
