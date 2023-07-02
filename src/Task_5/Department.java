package Task_5;

public class Department {
    protected String name;
    protected Address department_address;

    public Department(String name, Address department_address) {
        this.name = name;
        this.department_address = department_address;
    }

    public Department () {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getDepartment_address() {
        return department_address;
    }

    public void setDepartment_address(Address department_address) {
        this.department_address = department_address;
    }
}
