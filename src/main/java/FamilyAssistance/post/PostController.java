package FamilyAssistance.post;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/FamilyAssistance/post")
public class PostController {

    @Autowired
    PostService ps;


    @RequestMapping("/all")
    public Iterable<Post> getAll_array() {
        return ps.getAll();
    }

    @RequestMapping(value = "/findpost", params = {"user_id", "stage"})
    public List<Post> getPost(@RequestParam("user_id") String user_id, @RequestParam("stage") String stage) {
        return ps.getPostbyUser_idAndStage(user_id, stage);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/addpost")
    //specify the method otherwise default GET method work
    public Object addPost(@RequestBody Post temp) { //requestbody theke object ta niyo pls.
        return "{ \"registration\":\"" + ps.addpost(temp) + "\"}";

    }


}
