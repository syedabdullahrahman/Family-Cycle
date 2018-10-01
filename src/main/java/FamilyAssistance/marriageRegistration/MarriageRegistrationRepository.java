package FamilyAssistance.marriageRegistration;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MarriageRegistrationRepository extends CrudRepository<MarriageRegistration, String> {


    public MarriageRegistration findByRegNumber(String registrationNumber);

    public List<MarriageRegistration> findByKaziLicence(String kaziLicenceNumber);

    public List<MarriageRegistration> findAll();
}
