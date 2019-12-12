public class Main {
    public static void main(String[] args) {

        Shape test=new Rectangle (10,10  );
        Rectangle test1= (Rectangle) test;
        System.out.println ("Before: "+test1.getArea ());
        test1.resize ( 0.01 );
        System.out.println ("After: "+test1.resize (10 ));

    }
}
