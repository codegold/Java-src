package Lesson32UpcastAndDownCast;

public class Test {
    public static void main(String[] args) {
        /*//Upcasting.
        Animal animal = new Dog();
        Dog dog = new Dog();

        //Downcasting.
        Dog dog2 = (Dog) animal;
        dog2.bark();
        */

        Animal a = new Animal();
        Dog dog = (Dog) a;
        dog.bark();
    }
}
