package Task_4;

public class Worker extends Human {
    public Worker(String name, int age) {
        super(name, age);
    }

    protected void doMyJob (String job_title) {
        System.out.println(super.toString());
        System.out.println("I'm a "+ job_title);
        System.out.println();
    }
}
