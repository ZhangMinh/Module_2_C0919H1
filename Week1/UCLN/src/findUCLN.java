import java.util.Scanner;

public class findUCLN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner ( System.in );
        System.out.println ( "Nhập vào số nguyên a" );
        int a = scanner.nextInt ();
        System.out.println ( "Nhập vào số nguyên b" );
        int b = scanner.nextInt ();
        System.out.println ("Kết quả:");
        timUCLN ( a,b );
    }

    public static int timUCLN(int a, int b) {
        while (a != b) {
            if (a == 0 || b == 0) {
                System.out.println ( "Không có ước chung lớn nhất" );
            }
            if (a == 1 || b == 1) {
                System.out.println ( "a và b nguyên tố cùng nhau, UCLN =1" );
            }
            if (a > b) {
                a %= b;
                if (a == 0) {
                    return b;
                }
            } else {
                b %= a;
                if (b == 0) {
                    return a;
                }
            }
        }
        return a;
    }
}
