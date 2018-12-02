// Простой пример применения параметра в методе
/*class ChkNum {
    // вернуть логическое значение true,
    // если х содержит четное число
    boolean isEven(int x) { //Здесь х-целочисленный параметр МЕТОДА isЕvеn()
        if ((x % 2) == 0) return true;
        else return false;
    }
}

class ParmDemo {
    public static void main(String args[]) {
        ChkNum e = new ChkNum();
        if (e.isEven(10)) System.out.println("10 is Even."); // 10 это аргумент. Передача
        if (e.isEven(9)) System.out.println("9 is Even.");   // метода аргументу.
        if (e.isEven(8)) System.out.println("8 is Even.");
        if (e.isEven(2)) System.out.println("2 is Even.");

    }
}
*/
class Factor {
    boolean isFactor(int a, int b) { // isFactor Это МЕТОД
        if ((b % a) == 0) return true; // Б и А параметры МЕТОДА
        else return false;
    }
}

class isFact {
    public static void main(String args[]) {
        Factor x = new Factor();

        if (x.isFactor(2, 20)) System.out.println(" 2 is devider.");
        if (x.isFactor(3, 20)) System.out.println("This will not be printed.");
    }
}