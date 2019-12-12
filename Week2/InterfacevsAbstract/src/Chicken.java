public class Chicken extends Animal implements Edible{
    @Override
    public String howtoeat() {
        return "can eat";
    }

    @Override
    public String makeSound() {
        return "Ga keu: Cook tah cook tak";
    }
}
