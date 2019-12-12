public class Validator {
    public boolean checkMark(double mark) {
        if (mark >= 0 && mark <= 10) {
            return true;
        }  else return false;
    }
}
