package FamilyAssistance.marriedCouple;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class MarriedCouple {


    @Id
    @Column(name = "mcEmail")
    String mcemail;

    String mcusername;

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
