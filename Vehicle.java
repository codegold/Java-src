/* Программа, в которой используется класс Vehicle

Добавление параметризированного метода, в котором производится
расчет объема топлива, необходимого транспортному средству для
преодоления заданного расстояния.
*/
class Vehicle {
    int passengers; // количество пассажиров
    int fuelcap; // емкость топливного бака
    int mpg; // потребление топлива в милях на галлон

    // Это конструктор класса Vehicle.
    Vehicle(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    // Определить дальность поездки транспортного средства
    int range() {
        return fuelcap * mpg;
    }

    // Рассчитать объем топлива, необходимого транспортному
    // средству для преодоления заданного расстояния.
    double fuelNeeded(int miles) {
        return (double) miles / mpg;
    }
}

class VehConsDemo {
    public static void main(String args[]) {
        // Полностью сконструировать обьекты транспортных средств.
        Vehicle minivan1 = new Vehicle(7, 16, 21);
        Vehicle sportscar1 = new Vehicle(2, 14, 12);
        double gallons;
        int dist = 252;

        gallons = minivan1.fuelNeeded(dist);
        System.out.println("Для преодоления " + dist + " мини-фургону потребуется " +
                +gallons + " галлонов топлива.");

        gallons = sportscar1.fuelNeeded(dist);
        System.out.println("Для преодоления " + dist + " спорткару потребуется " +
                +gallons + " галлонов топлива.");


        /*System.out.println("Мини-фypгoн может перевезти " +
                minivan1.passengers + " пассажиров на " + minivan1.range() + " миль. ");
        minivan1.range(); //Show distance trip of minivan.

        System.out.println("Cпopтивный автомобиль может перевезти " +
                sportscar1.passengers + " пассажиров на " + sportscar1.range() + " миль. ");
        sportscar1.range(); //Show distance trip of sportscar.
        */
    }
}



