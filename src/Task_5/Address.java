package Task_5;

public class Address {
    protected String country;
    protected String region;
    protected String city;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Address(String country, String region, String city) {
        this.country = country;
        this.region = region;
        this.city = city;
    }

    public Address () {

    }
}
