// Класс, реализующий очередь для хранения символов
class Queuee {
    private char q[]; //массив для хранения элементов очереди
    private int putloc, getloc; // индексы для вставки и извлечения
    // элементов очереди

    // Сконструировать пустую очередь заданного размера
    Queuee(int size) {
        q = new char[size + 1]; // выделить память для очереди
        putloc = getloc = 0;
    }

    // Сконструировать очередь на основе имеющегося объекта Queuee
    Queuee(Queuee ob) {
        putloc = ob.putloc;
        getloc = ob.getloc;
        q = new char[ob.q.length];

        // Копировать элементы в очередь
        for (int i = getloc + 1; i <= putloc; i++)
            q[i] = ob.q[i];
    }

    // Сконструировать очередь на основе массива исходных значений
    Queuee(char a[]) {
        putloc = 0;
        getloc = 0;
        q = new char[a.length + 1];

        for (int i = 0; i < a.length; i++) put(a[i]);
    }

    // Поместить символ в очередь
    void put(char ch) {
        if (putloc == q.length - 1) {
            System.out.println(" - Очередь заполнена");
            return;
        }
        putloc++;
        q[putloc] = ch;
    }

    // Извлечь символ из очереди
    char get() {
        if (getloc == putloc) {
            System.out.println(" - Очередь пуста.");
            return (char) 0;
        }
        getloc++;
        return q[getloc];
    }
}

//Демонстрация использования класса Queuee
class QDemoo {
    public static void main(String args[]) {
        // Создать пустую очередь для хранения 10 элементов
        Queuee q1 = new Queuee(10);

        char name[] = {'T', 'o', 'm'};
        // Создать очередь на основе массива
        Queuee q2 = new Queuee(name);

        char ch;
        int i;

        // Поместить ряд символов в очередь ql
        for (i = 0; i < 10; i++)
            q1.put((char) ('A' + i));

        // Создать одну очередь на основе другой
        Queuee q3 = new Queuee(q1);

        // Показать очереди
        System.out.print("Содержимое q1: ");
        for (i = 0; i < 10; i++) {
            ch = q1.get();
            System.out.print(ch);
        }
        System.out.println("\n");

        System.out.print("Содержимое q2: ");
        for (i = 0; i < 3; i++) {
            ch = q2.get();
            System.out.print(ch);
        }
        System.out.println("\n");

        System.out.print("Содержимое q3: ");
        for (i = 0; i < 10; i++) {
            ch = q3.get();
            System.out.print(ch);


        }

    }
}