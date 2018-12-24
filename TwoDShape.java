// Простая иерархия классов.
// Класс, описывающий двумерные объекты,»
class TwoDShape {
    double height;
    double width;

    void showDim() {
        System.out.println("height and width is "
                + height + " and " + width);
    }
}
//Подкласс класса TwoDShape для представления треугольников
// Класс Triangle наследует от класса TwoDShape»

class Triangle extends  TwoDShape {
    //Из класса Triangle можно обращаться к членам класса
    // TwoDShape таким же обраэом, как и к собственным членам.
    String style;
    double area() {
        //Из класса Triangle можно обращаться к членам класса
        // TwoDShape таким же обраэом, как и к собственным членам.
    return (height * width) / 2;
    }
    void showStyle() {
        System.out.println("Triangle is " +style);
    }
}

class Shapes {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle();

        // Все члены класса Triangle, даже унаследованные от класса
        // TwoDShape, доступны из объектов типа Triangle.

        t1.style = "isosceles";
        t1.width = 4;
        t1.height = 4;

        t2.style = "right";
        t2.height = 12.6;
        t2.width = 8.7;

        System.out.println("T1 data is: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("T1 area is: " + t1.area());
        System.out.println();

        System.out.println("T2 data is: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("T2 area is: " + t2.area());
    }
}




