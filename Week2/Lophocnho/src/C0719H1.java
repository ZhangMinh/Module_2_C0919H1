public class C0719H1 extends Student implements PlayBoardgame {
    public C0719H1() {
    }


    public C0719H1(String name_id, String name, int age, double tuition_fee) {
        super ( name_id, name, age, tuition_fee );
    }

    @Override
    public boolean canPlayWereWolf() {
        return true;
    }
}
