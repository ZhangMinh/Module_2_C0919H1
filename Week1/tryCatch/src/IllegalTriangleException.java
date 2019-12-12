public class IllegalTriangleException extends Exception {
    public String getMessage() {
        System.out.println ("Không phải tam giác!");
        return null;
    }
//    public void ngoaile (double a, double b, double c) throws IllegalTriangleException {
//        Scanner sc = new Scanner ( System.in );
//        System.out.println ( "Nhập vào ba cạnh của tam giác" );
//        a = sc.nextDouble ();
//        b = sc.nextDouble ();
//        c = sc.nextDouble ();
//        if (a>0 &&b>0&&c>0 || a+c>b && a+b>c && c+b>a) {
//            System.out.println ("is triangle");
//        }
//        try {
//
//        } catch ( ) {
//
//        }
//    }
}
