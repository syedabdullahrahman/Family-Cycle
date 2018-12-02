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
    String name;
    String spouse_name;
    String dob;
    String sp_dob;
    String marriage_date;

    String password;

    public MarriedCouple() {

    }

    public MarriedCouple(String mcemail, String mcusername, String name, String spouse_name, String dob, String sp_dob, String marriage_date, String password) {
        this.mcemail = mcemail;
        this.mcusername = mcusername;
        this.name = name;
        this.spouse_name = spouse_name;
        this.dob = dob;
        this.sp_dob = sp_dob;
        this.marriage_date = marriage_date;
        this.password = password;
    }

    public String getMcemail() {
        return mcemail;
    }

    public void setMcemail(String mcemail) {
        this.mcemail = mcemail;
    }

    public String getMcusername() {
        return mcusername;
    }

    public void setMcusername(String mcusername) {
        this.mcusername = mcusername;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpouse_name() {
        return spouse_name;
    }

    public void setSpouse_name(String spouse_name) {
        this.spouse_name = spouse_name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getSp_dob() {
        return sp_dob;
    }

    public void setSp_dob(String sp_dob) {
        this.sp_dob = sp_dob;
    }

    public String getMarriage_date() {
        return marriage_date;
    }

    public void setMarriage_date(String marriage_date) {
        this.marriage_date = marriage_date;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
