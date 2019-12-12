import java.util.Random;

public class delArray {
    public static void main(String[] args) {
        int[] arr = ranArray ( 5 );
        int[] newarr = delArr ( 1, arr );
        System.out.println ( "Mảng cũ:" );
        for (int x : arr) {
            System.out.printf ( x + "-" );
        }
        System.out.println ( "\n--------------" );
        System.out.println ( "Mảng mới:" );
        for (int x : newarr) {
            System.out.printf ( x + "-" );
        }
    }

    public static int[] ranArray(int volume) {
        Random ran = new Random ();
        int[] arr = new int[volume];
        for (int i = 0; i < volume; i++) {
            arr[i] = ran.nextInt ( 10 ) + 0;
        }
        return arr;
    }

    public static int[] delArr(int index, int[] arr) {
        int[] newarr = new int[arr.length - 1];
        if (index >= 0 && index < arr.length) {
            for (int i = 0; i < newarr.length; i++) {
                newarr[i] = arr[i];
            }
            for (int i = index; i < newarr.length; i++) {
                newarr[i] = arr[i + 1];
            }
        } else {
            System.out.println ( "Vị trí nhập vào không đúng!" );
            return newarr;
        }

        return newarr;
    }
}
