package Task_7;

public class Trapezoid extends Figure {
    protected double a;
    protected double b;
    protected double h;

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public Trapezoid(double a, double b, double h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    public Trapezoid(){

    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }



    @Override
    public double getSquare() {
        return ((a + b) * h) / 2;
    }
}
