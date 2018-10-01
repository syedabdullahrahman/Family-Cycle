package FamilyAssistance.marriageRegistration;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MarriageRegistration {

    String gName, bName, gAddress, bAddress, gDob, bDob, gFather, gMother, bFather, bMother, gBlood, bBlood, wit1name, wit1address, wit2name, wit2address;
    String date;
    @Id
    @Column(name = "marriageRegNumber")
    String regNumber;

    String kaziLicence;
    int Denmohor;

    public MarriageRegistration() {

    }

    public MarriageRegistration(String date, String gName, String bName, String gAddress, String bAddress, String gDob, String bDob, String gFather, String gMother, String bFather, String bMother, String gBlood, String bBlood, String wit1name, String wit1address, String wit2name, String wit2address, String regNumber, String kaziLicence, int denmohor) {
        this.date = date;
        this.gName = gName;
        this.bName = bName;
        this.gAddress = gAddress;
        this.bAddress = bAddress;
        this.gDob = gDob;
        this.bDob = bDob;
        this.gFather = gFather;
        this.gMother = gMother;
        this.bFather = bFather;
        this.bMother = bMother;
        this.gBlood = gBlood;
        this.bBlood = bBlood;
        this.wit1name = wit1name;
        this.wit1address = wit1address;
        this.wit2name = wit2name;
        this.wit2address = wit2address;
        this.regNumber = regNumber;
        this.kaziLicence = kaziLicence;
        Denmohor = denmohor;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getgName() {
        return gName;
    }

    public void setgName(String gName) {
        this.gName = gName;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    public String getgAddress() {
        return gAddress;
    }

    public void setgAddress(String gAddress) {
        this.gAddress = gAddress;
    }

    public String getbAddress() {
        return bAddress;
    }

    public void setbAddress(String bAddress) {
        this.bAddress = bAddress;
    }

    public String getgDob() {
        return gDob;
    }

    public void setgDob(String gDob) {
        this.gDob = gDob;
    }

    public String getbDob() {
        return bDob;
    }

    public void setbDob(String bDob) {
        this.bDob = bDob;
    }

    public String getgFather() {
        return gFather;
    }

    public void setgFather(String gFather) {
        this.gFather = gFather;
    }

    public String getgMother() {
        return gMother;
    }

    public void setgMother(String gMother) {
        this.gMother = gMother;
    }

    public String getbFather() {
        return bFather;
    }

    public void setbFather(String bFather) {
        this.bFather = bFather;
    }

    public String getbMother() {
        return bMother;
    }

    public void setbMother(String bMother) {
        this.bMother = bMother;
    }

    public String getgBlood() {
        return gBlood;
    }

    public void setgBlood(String gBlood) {
        this.gBlood = gBlood;
    }

    public String getbBlood() {
        return bBlood;
    }

    public void setbBlood(String bBlood) {
        this.bBlood = bBlood;
    }

    public String getWit1name() {
        return wit1name;
    }

    public void setWit1name(String wit1name) {
        this.wit1name = wit1name;
    }

    public String getWit1address() {
        return wit1address;
    }

    public void setWit1address(String wit1address) {
        this.wit1address = wit1address;
    }

    public String getWit2name() {
        return wit2name;
    }

    public void setWit2name(String wit2name) {
        this.wit2name = wit2name;
    }

    public String getWit2address() {
        return wit2address;
    }

    public void setWit2address(String wit2address) {
        this.wit2address = wit2address;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getKaziLicence() {
        return kaziLicence;
    }

    public void setKaziLicence(String kaziLicence) {
        this.kaziLicence = kaziLicence;
    }

    public int getDenmohor() {
        return Denmohor;
    }

    public void setDenmohor(int denmohor) {
        Denmohor = denmohor;
    }
}
