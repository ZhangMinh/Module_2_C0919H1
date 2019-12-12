

public class demo {
    public static void main(String[] args) {
//        Animal chosoi = new Wolf ();
//        System.out.println (chosoi.makeSound ());


        Animal[] animals = new Animal[2];
        animals[0] = new Chicken ();
        animals[1] = new Wolf ();
        for (Animal x : animals) {
            System.out.println (x.makeSound ());
            if (x instanceof Chicken) {
                Edible edible = (Chicken) x;
                System.out.println (edible.howtoeat ());
            }
        }


//        Fruit fruit=new Fruit ();
//        System.out.println (fruit.howtoeat ());
    }
}
