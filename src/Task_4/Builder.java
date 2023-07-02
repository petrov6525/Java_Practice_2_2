package Task_4;

public class Builder extends Worker {
    public Builder(String name, int age) {
        super(name, age);
    }

    public void doMyJob(){
        super.doMyJob("builder");
    }
}
