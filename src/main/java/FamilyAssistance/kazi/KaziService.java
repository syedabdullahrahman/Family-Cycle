package FamilyAssistance.kazi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KaziService {

    @Autowired
    KaziRepository kaziRepository;

    public KaziService() {
    }

    public Kazi getKazi(String license) {

        return kaziRepository.findByKaziLicenceNumber(license);
    }

    public Kazi getKaziByUserNameandPassword(String email, String password) {

        return kaziRepository.findByKaziEmailAndKaziPassword(email, password);
    }


    public Iterable<Kazi> getAll() {
        return kaziRepository.findAll();
    }

    public String addkazi(Kazi temp) {
        try {
            if (!(getKazi(temp.kaziLicenceNumber).equals(new Kazi()))) {
                return "Kazi Exists";
            }
        } catch (Exception e) {

        }

        kaziRepository.save(temp);
        return "Success";
    }

    public String updateKazi(Kazi temp) {
        kaziRepository.save(temp);
        return "Success";
    }

    public void deleteKazi(Kazi temp, Long id) {

    }
}
