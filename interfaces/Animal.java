package interfaces;

public class Animal implements Info {
    public int id;

    public Animal(int id) {
        this.id = id; //Назначает этой переменной
        // стр6 переменную из параметров
    }

    public void sleep() {
        System.out.println("I am sleeping.");
    }

    public void sayHello(){
        System.out.println("Hello there.");
    }
    public void showInfo(){
        System.out.println("Id is " +this.id);

    }
}
