package kazi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Hashtable;

@RestController
@RequestMapping("/faq")
public class FAQController {

    @Autowired  //need dependecy injection
    FAQService fq;

    @RequestMapping("{question}")
    public String getKaziByName(@PathVariable("question") String question){
        return fq.getAnswer(question);
    }
    @RequestMapping("/all")
    public Hashtable<String, String> getAll() {
        return fq.getAll();
    }
}
