package FamilyAssistance.marriageRegistration;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/FamilyAssistance/marriageRegistration")
public class MarriageRegistrationController {
    @Autowired
    MarriageRegistrationService mrs;

    @RequestMapping("/all")
    public List<MarriageRegistration> getAll() {
        return mrs.getAll();
    }

    @RequestMapping("/{regNumber}")
    public MarriageRegistration getMarriageRegistrationByregNumber(@PathVariable("regNumber") String regNumber) {
        return mrs.getMarriageRegistrationByregNumber(regNumber);
    }

    @RequestMapping("/forKazi/{licenceNumber}")
    public List<MarriageRegistration> getMarriageRegistrationsForKazi(@PathVariable("licenceNumber") String licenceNumber) {
        return mrs.getMarriageRegistrationsForKazi(licenceNumber);
    }


    @RequestMapping(method = RequestMethod.POST, value = "/addmr")
    public Object addmr(@RequestBody MarriageRegistration temp) {
        return "{ \"registration\":\"" + mrs.addMarriageRegistration(temp) + "\"}";

    }
}
