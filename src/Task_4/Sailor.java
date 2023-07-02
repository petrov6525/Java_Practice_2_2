package Task_4;

public class Sailor extends Worker {
    public Sailor(String name, int age) {
        super(name, age);
    }

    public void doMyJob(){
        super.doMyJob("sailor");
    }
}
