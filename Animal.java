class MyClass3 {
    public static void main(String[ ] args) {
        /*Vehicle v1 = new Vehicle();
        Vehicle v2 = new Vehicle();
        //v1.color = "red";
        //v2.horn();
        Animal dog = new Animal(); // Дог теперь объект Энимал
        //dog.bark();                // через точку -> доступ к атрибутам и методам обьекта
        Animal cat = new Animal();
        //cat.meow();
        //System.out.println(v1.color);
        //System.out.println(v2);
        */
    }
}

public class Animal {  // "Это класс (обьект?)
    void bark() {      // Это метод, теперь нужно объявить обьект этого класса чтобы юзать класс и методы
        System.out.println("Woof-woof!");
        //return "Woof!"
    }
    void meow() {      //Добавил метод мяу
        System.out.println("Purr-purr!");
    }
}
