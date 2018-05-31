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

    public String getAnswer(String question) {
        if (qa.containsKey(question))
            return qa.get(question);
        else
            return "No answer found !!!";
    }
    public Hashtable<String, String> getAll() {
        return qa;
    }
}
