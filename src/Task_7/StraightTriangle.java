package Task_7;

public class StraightTriangle extends Figure {
    protected double a;
    protected double b;

    public StraightTriangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public StraightTriangle(){

    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double getSquare() {
        return (a * b) / 2;
    }
}
