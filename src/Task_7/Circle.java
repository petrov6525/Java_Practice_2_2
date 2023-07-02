package Task_7;

public class Circle extends Figure{
    protected double r;

    public Circle(double r) {
        this.r = r;
    }

    public Circle(){

    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double getSquare() {
        return 3.14 * r * r;
    }
}
