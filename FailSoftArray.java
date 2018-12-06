/* В этом классе реализуется "отказоустойчивый" массив,
предотвращающий ошибки времени выполнения*/

class FailSoftArray {
    private int a[];    // ссылка на массив
    private int errval; // значение, возвращаемое в случае
    // возникновения ошибки при выполнении
    // метода get ()
    public int length; // открытая переменная length

    /* Конструктору данного класса передается размер массива и
    значение, которое должен возвращать метод get() при
    возникновении ошибки.
    */
    public FailSoftArray(int size, int errv) {
        a = new int[size];
        errval = errv;
        length = size;
    }

    // Возвратить значение элемента массива с заданным индексом
    public int get(int index) {
        if (indexOK(index)) return a[index];
        return errval;
    }

    // Установить значение элемента с заданным индексом.
    // Если возникнет ошибка, возвратить логическое значение false.
    public boolean put(int index, int val) {
        if (indexOK(index)) {
            a[index] = val;
            return true;
        }
        return false;
    }

    // Вернуть логическое значение true, если индекс
    // не выходит за границы массива
    private boolean indexOK(int index) {
        if (index >= 0 & index < length) return true;
        return false;
    }
}

// Демонстрация работы с "отказоустойчивым" массивом
class FSDemo {
    public static void main(String args[]) {
        FailSoftArray fs = new FailSoftArray(5, -1);
        int x;

        // Демонстрация корректной обработки ошибок
        System.out.println("Oбpaбoткa ошибок без вывода отчета.");

        for (int i = 0; i < (fs.length * 2); i++)
            fs.put(i, i * 10);
        for (int i = 0; i < (fs.length * 2); i++) {
            x = fs.get(i);

            if (x != -1) System.out.print(x + " ");
        }
        System.out.println("");

        //Обработать ошибки
        System.out.println("\nОбработка ошибок с выводом отчета.");
        for (int i = 0; i < (fs.length * 2); i++)
            if (!fs.put(i, i * 10))
                System.out.println("Индекс " + i + " вне допустимого диапазона.");

        for (int i = 0; i < (fs.length * 2); i++) {
            x= fs.get(i);
            if (x != -1) System.out.print(x + " ");
            else
                System.out.println("Index " + i + " вне допустимого диапазона.");


        }
    }
}







