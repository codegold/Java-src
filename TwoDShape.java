// Простая иерархия классов.
// Класс, описывающий двумерные объекты,
// Добавление дополнительных конструкторов в класс TwoDShape.
// Multilevel hierarchy
// Применение динамической диспетчеризации методов.

// Создание абстрактного класса.
// Теперь класс TwoDShape является абстрактным.
abstract class TwoDShape {
    private double height; //now vars private
    private double width;
    private String name;

    // Конструктор по умолчанию.
    TwoDShape() {
        width = height = 0.0;
        name = "null";
    }

    // Параметризированный конструктор объектов
    //класса TwoDShape.
    TwoDShape(double w, double h, String n) {
        width = w;
        height = h;
        name = n;
    }

    // Конструирование объекта с одинаковыми значениями
    // переменных экземпляра width и height.
    TwoDShape(double x, String n) {

        width = height = x;
        name = n;
    }

    // Построение одного объекта на основании другого объекта.
    TwoDShape(TwoDShape ob) {
        width = ob.width;
        height = ob.height;
        name = ob.name;

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
    String getName() { return name; }

    void showDim() {
        System.out.println("height and width is "
                + height + " and " + width);
    }

    // Метод area() определен в классе TwoDShape.

    // Теперь метод area () является абстрактным.
    abstract double area();
        //System.out.println("area() mest be overridden");
        //return 0.0;

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
        super(w, h, "triangle");   // вызвать конструктор суперкласса с двумя аргументами
                // setWidth(w);
                //setHeight(h);

        style = s;
    }
    // Конструктор с одним аргументом для построения треугольника.
    Triangle(double x) {
        super(x, "triangle"); // вызвать конструктор суперкласса с одним аргументом
        style = "isosceles";
    }

    // построить один объект на основании другого объекта
    Triangle(Triangle ob) {
        // Передача ссылки на объект Triangle конструктору класса TwoDShape
        super(ob);
        style = ob.style;
    }

    // Переопределение метода area() для класса Triangle.
    double area() {
        //Из класса Triangle можно обращаться к членам класса
        // TwoDShape таким же обраэом, как и к собственным членам.
        return getHeight() * getWidth() / 2;
    }

    void showStyle() {

        System.out.println("Triangle is " + style);
    }
}
    // Подкласс, производный от класса Triangle.
    // Класс ColorTriangle является подклассом,
    // производным от класса Triangle, который, в
    // свою очередь, расширяет класс TwoDShape.
    // Следовательно, в класс   ColorTriangle   входят  переменные
    // и методы как из класса   Triangle,   так из  класса  TwoDShape.»

    /*class ColorTriangle extends Triangle {
        private String color;

        ColorTriangle(String c, String s, double w, double h) {
            super(s,w,h);
            color = c;
        }

        String getColor() { return color; }
        void showColor() {
            System.out.println("Color is " + color);
        }
       }*/
       // Подкласс, производный от класса TwoDShape,
       // для представлёния прямоугольников.


    class Rectangle extends TwoDShape {
           // Default constructor
        Rectangle() {

            super();
        }

        // Constructor of Rectangle class.
        Rectangle(double w, double h) {
            super(w,h, "rectangle"); //call constructor
            //of superclass.
        }
        // Creating square
        Rectangle(double x) {
            super(x, "rectangle"); //call constructor
            //of superclass.
        }
        // построить один объект на основании другого объекта
        Rectangle(Rectangle ob) {
            super(ob); // Give object to constructor of TwoDShape
            // class.
        }

        boolean isSquare() {
            if (getWidth() == getHeight()) return true;
            return false;
        }
        // Переопределение метода area() для класса Rectangle.
        double area() {

            return getWidth() * getHeight();
        }
    }

    class AbsShape {
        public static void main(String[] args) {
            TwoDShape shapes[] = new TwoDShape[4];

            shapes[0] = new Triangle("right", 8.0, 12.0);
            shapes[1] = new Rectangle(10);
            shapes[2] = new Rectangle(10,4);
            shapes[3] = new Triangle(7.0);
            //shapes[4] = new TwoDShape(10,20,"generic");

            for (int i=0; i < shapes.length; i++) {
                System.out.println("object os " + shapes[i].getName());
                // Требуемый вариант метода area() вызывается
                // для каждой геометрической фигуры в отдельности.
                System.out.println("Area is " + shapes[i].area());
                System.out.println();
            }
/*
class Shapes7 {
    public static void main(String[] args) {
        //ColorTriangle t1 = new ColorTriangle("Blue", "right", 8.0, 12.0);
        //ColorTriangle t2 = new ColorTriangle("Red", "isosceles", 2.0, 2.0);
        Triangle t1 = new Triangle("right", 8.0, 12.0);
        //create object t1 copy
        Triangle t2 = new Triangle(t1);

        System.out.println("Info for t1: ");
        t1.showStyle();
        t1.showDim();
        //t1.showColor();
        System.out.println("Area is " + t1.area());
        System.out.println();

        System.out.println("Info for t2: ");
        // Из объекта типа ColorTriangle можно вызывать как его
        // собственные методы, так и методы его суперклассов.
        t2.showStyle();
        t2.showDim();
        //t2.showColor();
        System.out.println("Area is " + t2.area());
        System.out.println();
*/

/*
                Triangle t1 = new Triangle();
        Triangle t4 = new Triangle("right", 8.0, 12.0);
        Triangle t5 = new Triangle(4.0);
                t4 = t5;
        // Все члены класса Triangle, даже унаследованные от класса
        // TwoDShape, доступны из объектов типа Triangle.

        System.out.println("t4 info: ");
        t4.showStyle();
        t4.showDim();
        System.out.println("Square - " + t4.area());
        System.out.println();

        System.out.println("t5 info: ");
        t5.showStyle();
        t5.showDim();
        System.out.println("Square - " + t5.area());
        System.out.println();
       */

    }

}




