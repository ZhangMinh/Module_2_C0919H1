import java.util.Scanner;

public class test1510 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner ( System.in );
        System.out.println ( "Nhap vao so luong so nguyen to can in:" );
        showSNT ( scanner.nextInt () );
    }

    public static boolean checkSNT(int value) {
        for (int i = 2; i <= Math.sqrt ( value ); i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void showSNT(int limit) {
        int i = 1;
        int count = 0;
        while (true) {
            i++;
            if (checkSNT ( i )) {
                System.out.println ( i );
                count++;
            }
            if (i==limit) {
                break;
            }
        }
    }
}
