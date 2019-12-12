import java.util.Scanner;

public class countPassedStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in );
        double[] arr = inputMark ();
        showMark ( arr );
        System.out.println ( "So luong sinh vien dau la: " + checkMark ( arr ) );
        method1.count
    }

    public static double[] inputMark() {
        Scanner sc = new Scanner ( System.in );
        double[] listMark = new double[30];
        Validator validator = new Validator ();
        double mark = sc.nextDouble ();
        int index = 0;
        System.out.println ( "Input " + index );
        if (validator.checkMark ( mark )) {
            listMark[index] = mark;
            index++;
        } else inputMark ();
        return listMark;
    }


    public static void showMark(double[] list) {
        for (int i = 0; i < 30; i++) {
            System.out.println ( list[i] );
        }
    }

    public static int checkMark(double[] list) {
        int count = 0;
        for (int i = 0; i < 30; i++) {
            if (list[i] > 5) {
                count++;
            }
        }
        return count;
    }
}
