package FamilyAssistance.note;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface postRepository extends CrudRepository<post, String> {


    public List<post> findByUser_idAndAndStage(String user_id, String stage);

}
