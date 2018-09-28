package FamilyAssistance.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@RestController
@RequestMapping("/FamilyAssistance/person")

public class PersonController {
    @Autowired
    PersonService personService;

    @RequestMapping("/all")
    public Iterable<Person> getAll() {
        return personService.getall();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/addperson")
    //specify the method otherwise default GET method work
    public Person addperson(@RequestBody Person temp) { //requestbody theke object ta niyo pls.
        personService.addPerson(temp);
        return temp;
    }

    @GetMapping(value = "/image", produces = MediaType.IMAGE_PNG_VALUE)
    public @ResponseBody byte[] getImage() throws IOException {
        byte[] data = Files.readAllBytes(Paths.get("screenshot.png"));
        return data;
    }

}
