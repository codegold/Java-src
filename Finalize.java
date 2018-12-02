class  FDemo {
    int x;

    FDemo(int i) {
        x = i;
    }

    // Вызывается при удалени обьекта.
    protected void finalize() {
        System.out.println("Finalization " + x);
    }
    //Генерирует обьект, который тотчас уничтожается.
    void generator(int i) {   //Метод Генератор.
        FDemo o = new FDemo(i); //Создается обьект типа ФДемо
    }
}

class Finalize {
    public static void main (String args[]) {
        int count;

        FDemo ob = new FDemo(0);

        /* Генерируется большое количество обьектов.
        В какой-то момент времени должна начаться сборка мусора.
        Примечание: возможно, чтобы активизировать систему сборки мусора,
        количество генерируемых обьектов придется увеличить.
         */
    for(count = 1; count < 100000; count++)
        ob.generator(count);
    }
}