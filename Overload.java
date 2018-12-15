//Перегрузка методов.
class Overload {
    void ovlDemo() { // 1st version
        System.out.println("No parameters");
    }

    //Перегрузка метода ovlDemo для одного параметра типа int
    void ovlDemo(int a) { // 2nd version
        System.out.println("One parameter: " + a);
    }

    //Перегрузка метода ovlDemo для двух параметров типа int
    int ovlDemo(int a, int b) { // 3rd version
        System.out.println("Two parameters: " + a + " " + b);
        return a + b;
    }

    // Перегрузка метода ovlDemo для двух параметров типа double
    double ovlDemo(double a, double b) {
        System.out.println("Two parameters -double- type: "
                + a + " " + b);
        return a + b;
    }
}

class OverloadDemo {
    public static void main(String[] args) {
        Overload ob = new Overload();
        int resI;
        double resD;

        // Поочередно вызвать все версии метода ovlDemo()
        ob.ovlDemo();
        System.out.println();

        ob.ovlDemo(2);
        System.out.println();

        resI = ob.ovlDemo(4, 6);
        System.out.println("Result of call ob.ovlDemo(4, 6): " +
                resI);
        System.out.println();

        resD = ob.ovlDemo(1.1, 2.32);
        System.out.println("Result of call ob.ovlDemo(1.1, 2.32): " +
                resD);;
    }
}