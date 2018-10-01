package FamilyAssistance.marriageRegistration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarriageRegistrationService {
    @Autowired
    MarriageRegistrationRepository marriageRegRepository;

    public MarriageRegistrationService() {

    }

    public List<MarriageRegistration> getMarriageRegistrationsForKazi(String KaziLicence) {

        return marriageRegRepository.findByKaziLicence(KaziLicence);
    }

    public MarriageRegistration getMarriageRegistrationByregNumber(String regNum) {

        return marriageRegRepository.findByRegNumber(regNum);
    }

    public Iterable<MarriageRegistration> getAll() {
        return marriageRegRepository.findAll();
    }

    public String addMarriageRegistration(MarriageRegistration temp) {
        marriageRegRepository.save(temp);
        return "Success";
    }
}
