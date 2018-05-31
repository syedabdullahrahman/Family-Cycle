package kazi;

import org.springframework.stereotype.Service;

import java.io.File;
import java.util.Hashtable;

@Service
public class FAQService {

    Hashtable<String, String> qa = new Hashtable<>();

    public FAQService() {

        qa.put("hi", "Hello");
        qa.put("howareyou", "Fine, and you?");
        qa.put("fine", "How about your day?");
        qa.put("whyshouldiattendamarriagepreparationprogram", "We've known each other for a long time and can't " +
                "imagine we'd learn anything new. " +
                "You don't have to discover all the things that make a marriage " +
                "work by trial and error. Others have done some of that work for you.");
        qa.put("howmuchincomeshouldwehavebetweenustomarry", "Many couples, especially younger ones, start their married lives together without a large income, and possibly with debt. " +
                "This can be a challenge, but it shouldn't necessarily delay marriage.");
        qa.put("howmuchdoesatypicalweddingcost", "Many wedding planners will tell you that the average wedding costs between $20,000-$30,000, but it definitely doesn't have to! " +
                "Although the ante has been rising as to what is considered typical for a wedding, simplicity can be elegant.");
        qa.put("isitnecessarytofeelchemistrybetweenusforthistobetherightpersontomarry", "Chemistry, or feeling like you click with another person, " +
                "is a natural part of a deepening relationship, and a wonderful part of falling in love, but unfortunately, chemistry is sometimes confused with infatuation, which can be fleeting.");
        qa.put("doesntlivingtogetherbeforemarriagepreventmefrommarryingthewrongpersonandthusgettingdivorcedlateron", "Although it may sound counterintuitive, studies show that cohabiting couples.");
    }

    private static String getResourcesPath() {
        File currDir = new File(".");
        String path = currDir.getAbsolutePath();
        path = path.substring(0, path.length() - 2);
        System.out.println(path);
        String resourcesPath = path + File.separator + "src" + File.separator + "main" + File.separator + "resources";
        return resourcesPath;
    }

    public Hashtable<String, String> getAnswer(String question) {
        Hashtable<String, String> t = new Hashtable<>();

        if (qa.containsKey(question)) {
            t.put("question", qa.get(question));
        } else
            t.put("question", "No answer found !!!");


        return t;
    }

    public Hashtable<String, String> getAll() {
        return qa;
    }
}
