package kazi;

import javax.persistence.Entity;


@Entity
public class MarriedCouple {

    String mcusername;
    String mcemail;
    String password;

    public MarriedCouple() {

    }

    public MarriedCouple(String mcusername, String mcemail, String password) {
        this.mcusername = mcusername;
        this.mcemail = mcemail;
        this.password = password;
    }

    public String getMcusername() {
        return mcusername;
    }

    public void setMcusername(String mcusername) {
        this.mcusername = mcusername;
    }

    public String getMcemail() {
        return mcemail;
    }

    public void setMcemail(String mcemail) {
        this.mcemail = mcemail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
