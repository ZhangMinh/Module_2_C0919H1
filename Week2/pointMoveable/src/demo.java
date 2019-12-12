public class demo {
    public static void main(String[] args) {
        MovablePoint A = new MovablePoint (1,1,1,1  );
        System.out.println (A);
        System.out.println ("=================");
        MovablePoint B = A.move ();
        System.out.println (B);

        System.out.println ("=================");
        B.setSpeed ( 2,2 );
        MovablePoint C = B.move ();
        System.out.println (C);


    }
}
