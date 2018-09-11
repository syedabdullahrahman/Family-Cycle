package marriedcouple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarriedCoupleService {
    @Autowired
    MarriedCoupleRepository mcRepository;

    public MarriedCoupleService() {
    }

    public List<MarriedCouple> getMarriedCouple(String email) {

        return mcRepository.findByMcemail(email);
    }

    public MarriedCouple getMcByemailAndPassword(String email, String password) {

        return mcRepository.findByMcemailAndPassword(email, password);
    }

    public Iterable<MarriedCouple> getAll() {
        return mcRepository.findAll();
    }

    public String addmc(MarriedCouple temp) {
        if (!getMarriedCouple(temp.mcemail).isEmpty()) return "Couple Exists";
        mcRepository.save(temp);
        return "Success";
    }

}
