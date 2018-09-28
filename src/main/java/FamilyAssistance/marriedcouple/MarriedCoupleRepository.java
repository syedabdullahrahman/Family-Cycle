package FamilyAssistance.marriedcouple;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MarriedCoupleRepository extends CrudRepository<MarriedCouple, String> {
    public List<MarriedCouple> findByMcemail(String email);

    public MarriedCouple findByMcemailAndPassword(String email, String password);
}

