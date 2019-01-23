package Lesson41AbstractClasses;

public class Dog extends Animal implements AbleToMakeSound {
    @Override
    public void makeSound() {
        System.out.println("Woof!");

    }
}
