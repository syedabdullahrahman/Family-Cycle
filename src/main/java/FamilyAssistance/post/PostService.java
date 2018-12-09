package FamilyAssistance.post;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public List<Post> findPost(Long userId) {
        return postRepository.findByUser_idAndAndStage(userId);
    }
}
