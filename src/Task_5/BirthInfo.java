package Task_5;

import java.util.Date;

public class BirthInfo {
    protected Date birth_date;
    protected Address birth_address;

    public BirthInfo(Date birth_date, Address birth_address) {
        this.birth_date = birth_date;
        this.birth_address = birth_address;
    }

    public BirthInfo () {

    }

    public Date getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(Date birth_date) {
        this.birth_date = birth_date;
    }

    public Address getBirth_address() {
        return birth_address;
    }

    public void setBirth_address(Address birth_address) {
        this.birth_address = birth_address;
    }
}
