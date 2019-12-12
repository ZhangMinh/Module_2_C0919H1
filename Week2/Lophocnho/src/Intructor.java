public class Intructor extends Person {
    @Override
    String sayhello() {
        return "Hello class!";
    }

    @Override
    boolean isMale() {
        return true;
    }

    private String name_id;
    private String name;
    private int age;
    private double salary;

    public Intructor() {
    }

    public Intructor(String name_id, String name, int age, double salary) {
        this.name_id = name_id;
        this.name = name;
        this.age = age;
        this.salary = salary;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isTeacher(Student x) {
        if (x.isMale ()) {
            return true;
        } else return false;
    }
}
