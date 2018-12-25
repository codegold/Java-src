// Применение ключевого слова super для предотвращения сокрытия имен.
class А {
    int i;
}

// создать подкласс, расширяющий класс А.
class B extends А {
    int i; // Эта переменная i скрывает переменную i из класса А.

    B(int a, int b) {
        // Оператор super.i ссылается на переменную i из класса А.
        super.i = a; // переменная i из класса А
        i = b;  // переменная i из класса В
    }

    void show() {
        System.out.println ("i in superclass: " + super.i);
                System.out.println("i in subclass: " + i);
    }
}

class UseSuper {
    public static void main(String args[]) {
        B subOb = new B(1, 2);

        subOb.show();
    }
}
