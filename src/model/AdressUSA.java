package model;

public class AdressUSA implements AdressValidator {

    private String Street;
    private String House;
    private String Apt;
    private String Locality;
    private String Region;
    private String PostalCode;

    public AdressUSA(String House, String Street, String Apt, String Locality, String Region, String PostalCode) {
        this.Street=Street;
        this.House=House;
        this.Apt=Apt;
        this.Locality=Locality;
        this.Region=Region;
        this.PostalCode=PostalCode;
    }

    public String info(){
        return " "+getHouse()+", St "+getStreet()+" Apt "+getApt()+" \n"+getLocality()+" "+getRegion()+" ,"+getPostalCode();
    }

    @Override
    public String getStreet() {
        return Street;
    }

    @Override
    public void setStreet(String Street) {
        this.Street=Street;
    }

    @Override
    public String getHouse() {
        return House;
    }

    @Override
    public void setHouse(String House) {
        this.House=House;
    }

    @Override
    public String getApt() {
        return Apt;
    }

    @Override
    public void setApt(String Apt) {
        this.Apt=Apt;
    }

    @Override
    public String getLocality() {
        return Locality;
    }

    @Override
    public void setLocality(String Locality) {
        this.Locality=Locality;
    }

    @Override
    public String getRegion() {
        return Region;
    }

    @Override
    public void setRegion(String Region) {
        this.Region=Region;
    }

    @Override
    public String getPostalCode() {
        return PostalCode;
    }

    @Override
    public void setPostalCode(String PostalCode) {
        this.PostalCode=PostalCode;
    }
}
