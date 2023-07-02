import Task_4.*;
import Task_5.ForeignPassport;
import Task_5.Passport;
import Task_6.*;
import Task_6.Worker;
import Task_7.*;
import Task_8.Array;


public class Main {
    public static void Task1(){
        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();
        Person p4 = new Person();
        System.out.println(Person.getCount_of_persons());
    }

    public static void Task2(){
        double s = SquareMaster.square_rhombus_by_side_and_corner(10, 15);
        s = SquareMaster.square_rhombus_by_side_and_corner(10, 15);
        s = SquareMaster.square_rhombus_by_side_and_corner(10, 15);
        s = SquareMaster.square_rhombus_by_side_and_corner(10, 15);
        s = SquareMaster.square_rhombus_by_side_and_corner(10, 15);

        System.out.println(s);
        System.out.println(SquareMaster.getSquare_counter());
    }

    public static void Task3(){
        System.out.println(MinMaxFact.getMin(25,3,6,0));
        System.out.println(MinMaxFact.getMax(25,3,6,0));
        System.out.println(MinMaxFact.getFact(5));
    }

    public static void Task4(){
        Builder builder = new Builder("Alex", 29);
        builder.doMyJob();

        Sailor sailor = new Sailor("Bob", 24);
        sailor.doMyJob();

        Pilot pilot = new Pilot("Sam", 34);
        pilot.doMyJob();
    }

    public static void Task5(){
        Passport passport = new Passport();
        ForeignPassport foreignPassport = new ForeignPassport();
    }

    public static void Task6(){
        Worker president = new President();
        Worker security = new Security();
        Worker manager = new Manager();
        Worker engineer = new Engineer();

        president.print();
        security.print();
        manager.print();
        engineer.print();
    }

    public static void Task7(){
        Figure rectangle = new Rectangle(5, 6);
        System.out.println(rectangle.getSquare());

        Figure cirlce = new Circle(5);
        System.out.println(cirlce.getSquare());

        Figure triangle = new StraightTriangle(5, 4);
        System.out.println(triangle.getSquare());

        Figure trapezoid = new Trapezoid(5, 6, 7);
        System.out.println(trapezoid.getSquare());
    }

    public static void Task8(){
        int[] arr = new int[]{1,2,3,4,5};

        Array array = new Array(arr);
        array.print();
        arr[0] = 10;
        array.print();
        array.push(10);
        array.print();
        array.pop();
        array.print();
    }



    public static void main(String[] args) {

//        Task1();
//        Task2();
//        Task3();
//        Task4();
//        Task5();
//        Task6();
//        Task7();
//        Task8();









    }

}