import java.util.Comparator;
import java.text.s
public class Student extends Person implements Comparator<Intructor> {
    @Override
    String sayhello() {
        return "Hello teacher!";
    }

    @Override
    boolean isMale() {
        return false;
    }
    private String name_id;
    private String name;
    private int age;
    private double tuition_fee;

    public Student() {
    }

    public Student(String name_id, String name, int age, double tuition_fee) {
        this.name_id = name_id;
        this.name = name;
        this.age = age;
        this.tuition_fee = tuition_fee;
    }

    public String getName_id() {
        return name_id;
    }

    public void setName_id(String name_id) {
        this.name_id = name_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getTuition_fee() {
        return tuition_fee;
    }

    public void setTuition_fee(double tuition_fee) {
        this.tuition_fee = tuition_fee;
    }
    public Boolean isJavaClass(Student x){
        if (x instanceof C0719H1) {
            return true;
        } else return false;
    }


    @Override
    public int compare(Intructor o1, Intructor o2) {
        return 0;
    }
}
