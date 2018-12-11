package FamilyAssistance.post;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends CrudRepository<Post, Long> {

    Iterable<Post> findByUser_idAndAndStage(String user_id, String stage);
}
