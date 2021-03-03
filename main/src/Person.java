public abstract class Person {
    protected String fName;
    protected String sName;
    protected String bin;
    protected String gender;

    public void setBin(String bin) {
        this.bin = bin;
    }

    public String getBin() {
        return bin;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getGender() {
        return gender;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }
}