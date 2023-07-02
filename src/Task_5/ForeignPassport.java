package Task_5;

import java.util.ArrayList;
import java.util.Date;

public class ForeignPassport extends Passport {
    protected Passport passport;
    protected String foreign_passport_serial_number;

    protected ArrayList<Visa> visa_list;

    public ForeignPassport(String foreign_passport_serial_number, ArrayList<Visa> visa_list) {
        this.passport = super.getPassportObject();
        this.foreign_passport_serial_number = foreign_passport_serial_number;
        this.visa_list = visa_list;
    }

    public ForeignPassport () {

    }

    public Passport getPassport() {
        return passport;
    }


    public String getForeign_passport_serial_number() {
        return foreign_passport_serial_number;
    }

    public void setForeign_passport_serial_number(String foreign_passport_serial_number) {
        this.foreign_passport_serial_number = foreign_passport_serial_number;
    }

    public ArrayList<Visa> getVisa_list() {
        return visa_list;
    }

    public void setVisa_list(ArrayList<Visa> visa_list) {
        this.visa_list = visa_list;
    }

    public void AddVisa (Visa visa) {
        this.visa_list.add(visa);
    }
}
