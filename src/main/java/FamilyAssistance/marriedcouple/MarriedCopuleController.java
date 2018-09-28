package FamilyAssistance.marriedcouple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mc")
public class MarriedCopuleController {

    @Autowired
    MarriedCoupleService mcs;

    @RequestMapping("/all")
    public Iterable<MarriedCouple> getAll() {
        return mcs.getAll();
    }

    @RequestMapping("/login/{email}/{password}")
    public MarriedCouple getMcByemailAndPassword(@PathVariable("email") String email, @PathVariable("password") String password) {
        return mcs.getMcByemailAndPassword(email, password);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/addmc")
    public Object addmc(@RequestBody MarriedCouple temp) {
        return "{ \"registration\":\"" + mcs.addmc(temp) + "\"}";

    }

}
