package FamilyAssistance.kazi;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KaziRepository extends CrudRepository<Kazi,Long> {

    public Kazi findByKaziLicenceNumber(String license);

    public Kazi findByKaziEmailAndKaziPassword(String email, String password);
}
