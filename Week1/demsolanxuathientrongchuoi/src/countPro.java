public class countPro {
    public static void main(String[] args) {
        String str = "Truong Ngoc Minh";
        System.out.println ( countStr ( str, 'k' ) );
    }

    public static int countStr(String str, char x) {
        int count = 0;
        for (int i = 0; i < str.length (); i++) {
            if (str.charAt ( i ) == x) {
                count++;
            }
        }
        return count;
    }

}
