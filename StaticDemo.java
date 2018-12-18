// Применение статической переменной,
class StaticDemo {
    int x; // обычная переменная экземпляра
    static int y; // статическая переменная — это одна копия,
    // совместно используемая всеми объектами.

    // возвратить сумму значений переменной экземпляра х и
    // статической переменной у.
    int sum() {
        return x + y;
    }
}

class SDemo {
    public static void main(String args[]) {
        StaticDemo ob1 = new StaticDemo();
        StaticDemo ob2 = new StaticDemo();

        // У каждого объекта имеется своя копия переменной экземпляра,
        ob1.x = 10;
        ob2.x = 20;
        System.out.println("Of course, obl.x and ob2.x " +
                "are independent.");
        System.out.println("obi.x: " + ob1.x +
                "\nob2.x: " + ob2.x);
        System.out.println() ;

        // Все объекты совместно пользуются одной общей
        // копией статической переменной.
        System.out.println("The static variable у is shared.");
        StaticDemo.y = 19;
        System.out.println("Set StaticDemo.y to 19.");

        System.out.println("ob1.sum() : " + ob1.sum());
        System.out.println("ob2.sum(): " + ob2.sum());
        System.out.println();

        StaticDemo.y = 100;
        System.out.println("Change StaticDemo.y to 100");

        System.out.println("ob1.sum() : " + ob1.sum());
        System.out.println("ob2.sum(): " + ob2.sum());
        System.out.println();
    }


}
