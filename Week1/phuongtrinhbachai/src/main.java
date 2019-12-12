import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        PTBH ptb2 = new PTBH ();
        Scanner sc = new Scanner ( System.in );
        System.out.println ( "PTBH ax*x+b*x+c=0..." );
        System.out.println ( "Nhap vao he so a" );
        ptb2.setA ( sc.nextDouble () );
        System.out.println ( "Nhap vao he so b" );
        ptb2.setB ( sc.nextDouble () );
        System.out.println ( "Nhap vao he so c" );
        ptb2.setC ( sc.nextDouble () );
        ptb2.getResult ( ptb2.getA (),ptb2.getB (),ptb2.getC () );
    }
}
