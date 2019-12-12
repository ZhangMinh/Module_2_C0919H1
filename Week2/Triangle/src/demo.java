public class demo {

    Validator check = new Validator ();
    Triangle tamgiac = new Triangle ();

    public static void main(String[] args) {
        Student student1 = new Student ( "minh" );
        Student student2 = student1;
        System.out.println ("BEFORE");
        System.out.println (student1.getName ());
        System.out.println (student2.getName ());
        System.out.println ("AFTER");
        student2.setName ( "trieu" );
        System.out.println (student1.getName ());
        System.out.println (student2.getName ());
    }

}
