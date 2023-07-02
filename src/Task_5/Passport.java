package Task_5;

import java.util.Date;

public class Passport {
    protected String serial_number;
    protected Department source_department;
    protected RegistrationAddress registration_address;
    protected BirthInfo birth_info;

    protected Date exists_time;

    public Passport(String serial_number, Department source_department, RegistrationAddress registration_address, BirthInfo birth_info, Date exists_time) {
        this.serial_number = serial_number;
        this.source_department = source_department;
        this.registration_address = registration_address;
        this.birth_info = birth_info;
        this.exists_time = exists_time;
    }

    public Passport(){

    }

    protected Passport getPassportObject () {
        return this;
    }

    public String getSerial_number() {
        return serial_number;
    }

    public void setSerial_number(String serial_number) {
        this.serial_number = serial_number;
    }

    public Department getSource_department() {
        return source_department;
    }

    public void setSource_department(Department source_department) {
        this.source_department = source_department;
    }

    public RegistrationAddress getRegistration_address() {
        return registration_address;
    }

    public void setRegistration_address(RegistrationAddress registration_address) {
        this.registration_address = registration_address;
    }

    public BirthInfo getBirth_info() {
        return birth_info;
    }

    public void setBirth_info(BirthInfo birth_info) {
        this.birth_info = birth_info;
    }

    public Date getExists_time() {
        return exists_time;
    }

    public void setExists_time(Date exists_time) {
        this.exists_time = exists_time;
    }
}
