package FamilyAssistance.marriedCouple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/FamilyAssistance/mc")
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

    @RequestMapping(value = "/findmc", params = {"email"})
    public MarriedCouple getKazi(@RequestParam("email") String email) {
        //lambda expression diya oo kemne jani kore !!!
        return mcs.getMarriedCouple(email);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/updatekazi")                //value="/updatekazi/{foo}
    public String updateKazi(@RequestBody MarriedCouple temp) {        //@PathVariable("foo") String id    //erokm oo chole
        return "{ \"registration\":\"" + mcs.updateMC(temp) + "\"}";
    }



}
