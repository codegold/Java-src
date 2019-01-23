package Lesson42EqualsAndStringPool;

public class Test {
    public static void main(String[] args) {
        Animal animal1 = new Animal(1);
        Animal animal2 = animal1;
        //System.out.println(animal1 == animal2); //Когда сравниваем == так,
        // мы сравниваем указатели а не структуру

        //System.out.println(animal1.equals(animal2));

        /*
        String string1 = new String("Hello");
        String string2 = new String("Hello"); //Стринги сравнивать только Иквуалс!!!

        System.out.println(string1 == string2);
        */

        String a = "hello";
        String b = "hello123".substring(0, 5);

        System.out.println(b);
        System.out.println(a.equals(b));
        System.out.println(a == b);
    }
}

class Animal {
    private int id;

    public Animal(int id) {//Конструктор,  принимает на вход целове число
        //и назначает нашему объекту этот ИД.
        this.id = id;
    }

    public boolean equals(Object obj) {
        Animal otherAnimal = (Animal) obj;
        return this.id == otherAnimal.id;

    }
}

