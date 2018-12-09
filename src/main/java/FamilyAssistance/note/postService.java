package FamilyAssistance.note;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class postService {
    @Autowired
    postRepository postRepository;

    public Iterable<post> getAll() {
        return postRepository.findAll();
    }

    public List<post> getPostbyUser_idAndStage(String user_id, String stage) {
        return postRepository.findByUser_idAndAndStage(user_id, stage);
    }

    public String addPost(post temp) {
        postRepository.save(temp);
        return "Success";
    }

}
