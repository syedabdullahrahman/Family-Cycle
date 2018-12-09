package FamilyAssistance.note;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/FamilyAssistance/post")
public class postController {
    @Autowired
    postService ps;

    @RequestMapping("/all")
    public Iterable<post> getAll() {
        return ps.getAll();
    }

    @RequestMapping(value = "/findpost", params = {"user_id", "stage"})
    public List<post> getKazi(@RequestParam("user_id") String user_id, @RequestParam("stage") String stage) {
        return ps.getPostbyUser_idAndStage(user_id, stage);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/addpost")
    //specify the method otherwise default GET method work
    public Object addPost(@RequestBody post temp) { //requestbody theke object ta niyo pls.
        return "{ \"registration\":\"" + ps.addPost(temp) + "\"}";

    }
}
