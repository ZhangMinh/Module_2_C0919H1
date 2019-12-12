import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int choice=-1;
        Scanner scanner = new Scanner ( System.in );
        do {
        System.out.println ( "Bạn muốn vẽ hình gì?" );
        System.out.println ( "1- Hình chữ nhật" );
        System.out.println ( "2- Hình vuông" );
        System.out.println ( "3- Hình tam giác thuận" );
        System.out.println ( "4- Hình tam giác ngược" );
        System.out.println ( "0- Thoát" );
        choice = scanner.nextInt ();
            switch (choice) {
                case 1:
                    hinhChuNhat ( 4, 5 );
                    break;
                case 2:
                    hinhVuong ( 5 );
                    break;
                case 3:
                    hinhTamGiac ( 5 );
                    break;
                case 4:
                    hinhTamGiac1 ( 5 );
                    break;
                case 0:
                    System.exit ( 0 );
                default:
                    System.out.println ( "Bạn đã không chọn" );
            }

        }while (choice != 0);

    }

    public static void hinhChuNhat(int chieudai, int chieurong) {
        System.out.println ( "Hình chữ nhật:" );
        for (int i = 0; i < chieudai; i++) {
            for (int j = 0; j < chieurong; j++) {
                System.out.printf ( "*" );
            }
            System.out.printf ( "\n" );
        }
    }

    public static void hinhVuong(int canh) {
        System.out.println ( "Hình vuông:" );
        for (int i = 0; i < canh; i++) {
            for (int j = 0; j < canh; j++) {
                System.out.printf ( "*" );
            }
            System.out.printf ( "\n" );
        }
    }

    //bottom - left
    public static void hinhTamGiac(int canh) {
        System.out.println ( "Hình tam giác thuận:" );
        for (int i = 0; i <= canh; i++) {
            for (int j = 0; j < i; j++) {
                System.out.printf ( "*" );
            }
            System.out.printf ( "\n" );
        }
    }

    //top - left
    public static void hinhTamGiac1(int canh) {
        System.out.println ( "Hình tam giác ngược:" );
        for (int i = canh; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.printf ( "*" );
            }
            System.out.printf ( "\n" );
        }
    }
}
