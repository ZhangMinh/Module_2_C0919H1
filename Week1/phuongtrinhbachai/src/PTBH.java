public class PTBH {
    private double a;
    private double b;
    private double c;

    public PTBH() {
    }

    public PTBH(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDelta(double a, double b, double c) {
        return this.b * this.b - 4 * this.a * this.c;
    }

    public double getNghiem1(double a, double b, double c) {
        return (-this.b + Math.sqrt ( getDelta ( a, b, c ) )) / 2 * a;
    }

    public double getNghiem2(double a, double b, double c) {
        return (-this.b - Math.sqrt ( getDelta ( a, b, c ) )) / 2 * a;
    }

    public void getResult(double a, double b, double c) {
        if (getDelta ( a, b, c ) < 0) {
            System.out.println ( "phuong trinh vo nghiem" );
        } else if (getDelta ( a, b, c ) > 0) {
            System.out.println ( "Phuong trinh co hai nghiem phan biet:" );
            System.out.println ( "x1=" + getNghiem1 ( a, b, c ) );
            System.out.println ( "x2=" + getNghiem2 ( a, b, c ) );
        } else if (getDelta ( a, b, c ) == 0) {
            System.out.println ( "Phuong trinh co mot nghiem kep:" );
            System.out.println ( "x1=" + getNghiem1 ( a, b, c ) );
        }
    }
}
