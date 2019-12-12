import java.util.Scanner;

public class gopmang {
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in );
        System.out.println ( "##Nhập vào độ dài mảng 1:" );
        String[] arr1 = newArr ( sc.nextInt () );

        System.out.println ( "##Nhập vào độ dài mảng 2:" );
        String[] arr2 = newArr ( sc.nextInt () );

        System.out.println ( "*Mảng 1:" );
        showArr ( arr1 );

        System.out.println ( "\n*Mảng 2:" );
        showArr ( arr2 );

        String[] newArr = addArr ( arr1, arr2 );

        System.out.println ( "\n*Mảng mới:" );
        showArr ( newArr );
    }

    public static String[] newArr(int volume) {
        Scanner sc = new Scanner ( System.in );
        String[] arr = new String[volume];
        for (int i = 0; i < arr.length; i++) {
            System.out.println ( "Nhập vào phần tử thứ " + i + ":" );
            arr[i] = sc.nextLine ();
        }
        return arr;
    }

    public static String[] addArr(String[] arr1, String[] arr2) {
        String newArr[] = new String[arr1.length + arr2.length];
        System.out.println (newArr.length);
        for (int i = 0; i < arr1.length; i++) {
            newArr[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            newArr[arr1.length+i] = arr2[i];
        }
        return newArr;
    }

    public static void showArr(String[] arr) {
        for (String x : arr) {
            System.out.printf ( x + "-" );
        }
    }

}
