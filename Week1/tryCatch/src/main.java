import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in );

        System.out.println ( "Nhập vào ba cạnh của tam giác" );
        double a = sc.nextDouble ();
        double b = sc.nextDouble ();
        double c = sc.nextDouble ();
        try {
            checkTamGiac ( a, b, c );
        }
        catch(IllegalTriangleException e) {
            System.out.println ("Không phải tam giác!");
        }

    }

    public static void checkTamGiac(double a, double b, double c) throws IllegalTriangleException {
        if (!(a > 0 && b > 0 && c > 0) || !(a + c > b && a + b > c && c + b > a)) {
            throw new IllegalTriangleException();
        }
    }
}
