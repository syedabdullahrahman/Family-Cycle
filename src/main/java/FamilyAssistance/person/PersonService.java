package FamilyAssistance.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    PersonRepository personrepo;

    public void addPerson(Person temp) {
        personrepo.save(temp);
    }

    public Iterable<Person> getall() {
        return personrepo.findAll();
    }
}
