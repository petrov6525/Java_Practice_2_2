package Task_4;

public class Pilot extends Worker{
    public Pilot(String name, int age) {
        super(name, age);
    }

    public void doMyJob(){
        super.doMyJob("pilot");
    }
}
