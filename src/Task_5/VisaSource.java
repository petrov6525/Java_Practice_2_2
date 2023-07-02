package Task_5;

public class VisaSource {
    protected Department department;

    public VisaSource(Department department) {
        this.department = department;
    }

    public VisaSource () {

    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
