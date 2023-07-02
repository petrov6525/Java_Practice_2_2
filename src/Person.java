import java.util.Date;

public class Person {

    protected static int count_of_persons;

    public static int getCount_of_persons(){
        return count_of_persons;
    }

    protected Date birth;
    protected String phone;
    protected String country;
    protected String city;
    protected String address;
    protected String first_name;
    protected String last_name;

    public Person(Date birth, String phone, String country, String city, String address, String first_name, String last_name) {
        this.birth = birth;
        this.phone = phone;
        this.country = country;
        this.city = city;
        this.address = address;
        this.first_name = first_name;
        this.last_name = last_name;

        count_of_persons++;
    }
    public Person(){
        count_of_persons++;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public Date getBirth() {
        return birth;
    }

    public String getPhone() {
        return phone;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getAddress() {
        return address;
    }


    @Override
    public String toString() {
        return "Person{" +
                "first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", birth=" + birth +
                ", phone='" + phone + '\'' +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", address='" + address + '\'' +
                '}';
    }


}