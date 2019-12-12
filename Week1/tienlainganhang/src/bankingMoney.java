import java.util.Scanner;

public class bankingMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner ( System.in );
        double laisuat = 1;
        double tiengui = 1;
        double sothang = 1;
        int choice;
        while (laisuat == 1) {
            System.out.println ( "Chọn ngân hàng cần gửi" );
            System.out.println ( "1- Agribank" );
            System.out.println ( "2- DongAbank" );
            System.out.println ( "3- Vietcombank" );
            System.out.println ( "4- Sacombank" );
            System.out.println ( "0- Exit" );
            choice = scanner.nextInt ();
            switch (choice) {
                case 1:
                    laisuat = 0.5833333333333333;
                    break;
                case 2:
                    laisuat = 0.6666666666666667;
                    break;
                case 3:
                    laisuat = 0.75;
                    break;
                case 4:
                    laisuat = 0.8333333333333333;
                    break;
                case 0:
                    System.exit ( 0 );
                default:
                    System.out.println ( "Xin mời chọn lại" );
            }
        }
        System.out.println ( "Bạn muốn gửi bao NHIÊU?" );
        tiengui = scanner.nextDouble ();
        System.out.println ( "Bạn muốn gửi bao LÂU?" );
        sothang = scanner.nextDouble ();
        double tong=tiengui+tinhTienLai ( laisuat,tiengui,sothang );
        System.out.println (tong);
        System.out.println (laisuat);
    }

    public static double tinhTienLai(double laisuat, double tiengui, double sothang) {
        double tienlai = tiengui * laisuat/100;
        for (int i = 1; i <= sothang; i++) {
            tienlai = (tienlai + tiengui) * laisuat/100;
        }
        return tienlai;
    }
}
