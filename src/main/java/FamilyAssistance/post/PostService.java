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

}
