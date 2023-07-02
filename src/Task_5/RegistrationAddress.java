package Task_5;

public class RegistrationAddress extends Address {
    protected String street;
    protected String build;
    protected String apartment;

    public RegistrationAddress(String country, String region, String city, String street, String build, String apartment) {
        super(country, region, city);
        this.street = street;
        this.build = build;
        this.apartment = apartment;
    }

    public RegistrationAddress () {

    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuild() {
        return build;
    }

    public void setBuild(String build) {
        this.build = build;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }
}
