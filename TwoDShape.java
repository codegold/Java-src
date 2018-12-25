// Простая иерархия классов.
// Класс, описывающий двумерные объекты,»
class TwoDShape {
    private double height; //now vars private
    private double width;

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
    //Constructor

    Triangle(String s, double w, double h) {
        setWidth(w);
        setHeight(h);

        style = s;
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

class Shapes3 {
    public static void main(String[] args) {
        Triangle t1 = new Triangle("Over painted", 4.0, 4.0);
        Triangle t2 = new Triangle("Contour", 8.0, 12.0);

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
    }
}




