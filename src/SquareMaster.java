public class SquareMaster {
    protected static int square_counter;

    public static int getSquare_counter(){
        return square_counter;
    }

    public static double square_triangle_with_height(double a, double h){
        square_counter++;
        return (a * h) / 2;
    }

    public static double square_triangle_with_gerone(double a, double b, double c){
        double p = a + b + c;

        square_counter++;
        return Math.sqrt(p * (p - a)* (p - b) * (p - c));
    }

    public static double square_rectangle(double a, double b){
        square_counter++;
        return a * b;
    }

    public static double square_square(double a){
        square_counter++;
        return a * a;
    }

    public static double square_rhombus_by_diagonals (double d1, double d2){
        square_counter++;
        return (d1 * d2) / 2;
    }

    public static double square_rhombus_by_side_and_corner (double a, double corner){
        double h = a * Math.cos(corner / 2);
        double d1 = 2 * h;

        double b = Math.sqrt((a * a) - (h * h));
        double d2 = 2 * b;

        return SquareMaster.square_rhombus_by_diagonals(d1, d2);
    }
}
