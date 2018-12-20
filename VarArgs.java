// Демонстрация метода с аргументами переменной длины,
class VarArgs {

    // Метод vaTest() с аргументами переменной длины,
    static void vaTest(int... v) {
        System.out.println("Number of args: " + v.length);
        System.out.println("Contents: ");

        for (int i = 0; i < v.length; i++)
            System.out.println(" arg " + i + ": " + v[i]);

        System.out.println();
    }

    public static void main(String args[]) {
        // Метод vaTest()   может вызываться с переменным числом аргументов.
        vaTest(10); //  1 аргумент
        vaTest(1, 2, 3); //  3 аргумента
        vaTest();   //  без аргументов
    }
}