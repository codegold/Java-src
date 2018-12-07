/*
Упражнение 5.2
Класс, реализующий очередь для хранения символов
*/
// Усовершенствованный класс очереди, предназначенной
// для хранения символьных значений

class Queue2 {
    // Эти члены класса теперь являются закрытыми
    private  char q[]; //массив для хранения элементов очереди
    private int putloc, getloc; // индексы для вставки и извлечения

    // элементов очереди
    Queue2(int size) {
        q = new char[size + 1]; // выделить память для очереди
        putloc = getloc = 0;
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

//Демонстрация использования класса Queue
class QDemo2 {
    public static void main(String args[]) {
        Queue2 bigQ = new Queue2(100);
        Queue2 smallQ = new Queue2(4);
        //Queue2 test = new Queue2(10);
        //test.q[0] = 99;
        //test.putloc = -100;
        char ch;
        int i;
        System.out.println("Иcпoльзoвaниe очереди BigQ для\n" +
                "сохранения алфавита");
        // Поместить буквенные символы в очередь ЬigQ
        for (i = 0; i < 26; i++)
            bigQ.put((char) ('A' + i));

        // Извлечь буквенные символы из очереди bigQ и отобразить
        System.out.print("Coдepжимoe очереди BigQ: ");
        for (i = 0; i < 26; i++) {
            ch = bigQ.get();
            if (ch != (char) 0) System.out.print(ch);
        }

        System.out.println("\n");

        System.out.println("Использованиие очереди smallQ" +
                "для генерации ошибок.");
        //Использовать очередь smallQ для генерации ошибок.
        for (i = 0; i < 5; i++) {
            System.out.println("Попытка сохранения " + (char) ('Z' - i));

            smallQ.put((char) ('Z' - i));
            System.out.println();
        }
        System.out.println();

        //Дополнительные ошибки при обращении к очереди smallQ
        System.out.println("Содержимое smallQ: ");
        for (i = 0; i < 5; i++) {
            ch = smallQ.get();
            if (ch != (char) 0) System.out.println(ch);
        }
    }

}

