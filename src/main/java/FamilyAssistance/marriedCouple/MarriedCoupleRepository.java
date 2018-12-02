package FamilyAssistance.marriedCouple;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarriedCoupleRepository extends CrudRepository<MarriedCouple, String> {
    public MarriedCouple findByMcemail(String email);

    public MarriedCouple findByMcemailAndPassword(String email, String password);
}

