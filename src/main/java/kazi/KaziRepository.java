package kazi;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface KaziRepository extends CrudRepository<Kazi,Long> {

    public List<Kazi> findByKaziLicenceNumber(Long id);

    public Kazi findByKaziEmailAndKaziPassword(String email, String password);
}
