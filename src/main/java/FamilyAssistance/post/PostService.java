package FamilyAssistance.post;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    @Autowired
    PostRepository postRepository;

    public PostService() {
    }

    public Iterable<Post> getAll() {
        return postRepository.findAll();
    }

    public String addpost(Post temp) {
        postRepository.save(temp);
        return "Success";
    }

    public Iterable<Post> getPost(String user_id, String stage) {
        return postRepository.findByUser_idAndAndStage(user_id, stage);
    }
}
