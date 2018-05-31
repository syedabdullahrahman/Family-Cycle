package kazi;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class FAQService {

    Hashtable<String, String> qa = new Hashtable<String, String>();

    public FAQService() {
        qa.put("Hi","Hello");
        qa.put("How are you?","Fine, and you?");
        qa.put("Fine","How about your day?");
    }

    public Hashtable<String, String> getAnswer(String question) {
        Hashtable<String, String> t = new Hashtable<>();
        if (qa.containsKey(question)) {
            t.put("question", qa.get(question));
        }
        else
            t.put("question", "No answer found !!!");
        return t;
    }
    public Hashtable<String, String> getAll() {
        return qa;
    }
}
