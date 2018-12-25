// Простая иерархия классов.
// Класс, описывающий двумерные объекты,
// Добавление дополнительных конструкторов в класс TwoDShape.
class TwoDShape {
    private double height; //now vars private
    private double width;

    // Конструктор по умолчанию.
    TwoDShape() {
        width = height = 0.0;
    }

    // Параметризированный конструктор объектов
    //kласса TwoDShape.
    TwoDShape(double w, double h) {
        width = w;
        height = h;
    }

    // Конструирование объекта с одинаковыми значениями
    // переменных экземпляра width и height.
    TwoDShape(double x) {
        width = height = x;
    }

    // Методы доступа к переменным экземпляра width и height.

    double getWidth() {
        return width;
    }
    double getHeight() {
        return height;
    }
    void setWidth(double w) {
        width = w;
    }
    void setHeight(double h) {
        height = h;
    }
    void showDim() {
        System.out.println("height and width is "
                + height + " and " + width);
    }
}
//Подкласс класса TwoDShape для представления треугольников
// Класс Triangle наследует от класса TwoDShape»


class Triangle extends TwoDShape {
    //Из класса Triangle можно обращаться к членам класса
    // TwoDShape таким же обраэом, как и к собственным членам.
    private String style;
    // Использование оператора super () для вызова
    // разных вариантов конструктора TwoDShape() .
    // Конструктор по умолчанию.
    Triangle(){
        super(); // вызвать конструктор суперкласса по умолчанию

        style = "null";
    }
            //Constructor
            // Параметризированный конструктор.
    Triangle(String s, double w, double h) {
        // Использование оператора super () для вызова
        // конструктора класса TwoDShape.
        super(w, h);   // вызвать конструктор суперкласса с двумя аргументами
                // setWidth(w);
                       //setHeight(h);

        style = s;
    }
    // Конструктор с одним аргументом.
    Triangle(double x) {
        super(x); // вызвать конструктор суперкласса с одним аргументом
                style = "isosceles";
    }

    double area() {
        //Из класса Triangle можно обращаться к членам класса
        // TwoDShape таким же обраэом, как и к собственным членам.
        return getHeight() * getWidth() / 2;
    }

    void showStyle() {

        System.out.println("Triangle is " + style);
    }
}

class Shapes5 {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle("right", 8.0, 12.0);
        Triangle t3 = new Triangle(4.0);
                t1 = t2;
        // Все члены класса Triangle, даже унаследованные от класса
        // TwoDShape, доступны из объектов типа Triangle.

        System.out.println("t1 info: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Square - " + t1.area());
        System.out.println();

        System.out.println("t2 info: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Square - " + t2.area());
        System.out.println();

        System.out.println("t3 info: ");
        t3.showStyle();
        t3.showDim();
        System.out.println("Square - " + t3.area());
        System.out.println();


    }
}




