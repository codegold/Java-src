//override od method
// Переопределение метода,
class А {
    int i, j;

    A(int a, int b) {
        i = a;
        j = b;
    }

    // отобразить переменные i и j
    void show() {
        System.out.println("i and j: " + i + " " + j) ;
    }
}

class B extends A {
    int k;

    В(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    // Отображение переменной к. Данный метод переопределяет
    // метод show() из класса А.
    void show() {
        System.out.println("k: " + k);
    }
}

class Override {
    public static void main(String args[])  {
        B subOb = new B(1, 2,  3) ;

        subOb.show(); // вызвать метод show() из класса В
    }
}