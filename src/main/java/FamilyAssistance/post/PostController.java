package FamilyAssistance.post;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/FamilyAssistance/post")
public class PostController {

    @Autowired
    PostService ps;


    @RequestMapping("/all")
    public Iterable<Post> getAll_array() {
        return ps.getAll();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/addpost")
    //specify the method otherwise default GET method work
    public Object addPost(@RequestBody Post temp) { //requestbody theke object ta niyo pls.
        return "{ \"registration\":\"" + ps.addpost(temp) + "\"}";

    }

    @RequestMapping("/login/{user_id}/{stage}")
    public Iterable<Post> getPost(@PathVariable("user_id") String user_id, @PathVariable("stage") String stage) {
        return ps.getPost(user_id, stage);
    }

}
