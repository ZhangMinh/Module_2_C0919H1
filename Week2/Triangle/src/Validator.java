public class Validator {
    public boolean checkSide(double a, double b, double c) {
        if (a > 0 && b > 0 && c > 0 && (a + b > c || b + c > a || c + a > b)) {
            return true;
        } else return false;
    }
}
