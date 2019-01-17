package Lesson33Generics;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        //////////Java 5 //////////////
        List animals = new ArrayList();
        Animal ourAnimal = new Animal();
        animals.add("cat");
        animals.add("dog");
        animals.add("frog");
        animals.add(ourAnimal);

        String animal = (String) animals.get(3);
        System.out.println(animal);

        ///////// With Generics ///////////
        List<String> animals2 = new ArrayList<String>();
        animals2.add("Cat");
        animals2.add("Dog");
        animals2.add("Frog");
        //animals2.add(ourAnimal);

        String animal2 = animals2.get(2);

        //////////// JAVA 7 //////////////

        List<String> animals3 = new ArrayList<>();
        animals3.add("Owl");
        animals3.add("Horse");
        animals3.add("Chicken");


    }
}

class Animal {

}
