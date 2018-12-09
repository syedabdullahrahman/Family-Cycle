package FamilyAssistance.post;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends CrudRepository<Post, Long> {

    public List<Post> findByUser_idAndAndStage(Long user_id, String stage);
}
