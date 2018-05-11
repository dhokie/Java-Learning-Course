package Inheritance;

/**
 * Created by TSI on 5/11/2018.
 */
public class Inheritance {


        public static void main(String[ ] args) {
            Dog d = new Dog();
            d.eat();
        }
    }

class Animal {
    protected int legs;
    public void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    Dog() {
        legs = 4;
    }
}
