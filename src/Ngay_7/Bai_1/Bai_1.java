package Ngay_7.Bai_1;

import Ngay_7.Bai_3.Orange;

public class Bai_1 {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
for (Animal animal: animals) {
    System.out.println(animal.makeSound());
    if (animal instanceof Chicken) System.out.println(animal.howToEat());
}
Orange orange = new Orange();
 System.out.println(orange.howToEat());
    }

}
