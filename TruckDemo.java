/* Программа, в которой используется класс Vehicle

Добавление параметризированного метода, в котором производится
расчет объема топлива, необходимого транспортному средству для
преодоления заданного расстояния.
*/
class Vehicle2 {
    private int passengers; // количество пассажиров
    private int fuelcap; // емкость топливного бака
    private int mpg; // потребление топлива в милях на галлон

    // Это конструктор класса Vehicle.
    Vehicle2(int p, int f, int m) {
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

    // Методы доступа к переменным экземпляра,
    int getPassengers() {
        return passengers;
    }

    void setPassengers(int p) {
        passengers = p;
    }

    int getFuelcap() {
        return fuelcap;
    }

    void setFuelcap(int f) {
        fuelcap = f;
    }

    int getMpg() {
        return mpg;
    }

    void setMpg(int m) {
        mpg = m;
    }
}


// Расширение класса Vehicle для грузовиков,
class Truck extends Vehicle2 {
    private int cargocap; // грузоподъемность в фунтах

    // Конструктор класса Truck.
    Truck(int p, int f, int m, int c) {
        /* Инициализация переменных из класса Vehicle
            с помощью вызываемого конструктора этого класса. */
        super(p, f, m);
        cargocap = c;
    }

    // Методы доступа к переменной cargocap.
    int getCargo() {
        return cargocap;
    }

    void putCargo(int c) {
        cargocap = c;
    }
}

class TruckDemo {
    public static void main(String args[]) {
        // построить ряд новых объектов типа Truck

                // Полностью сконструировать обьекты транспортных средств.
        Vehicle2 minivan1 = new Vehicle2(7, 16, 21);
        Vehicle2 sportscar1 = new Vehicle2(2, 14, 12);
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



