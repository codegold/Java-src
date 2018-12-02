// Применение оператора break во вложенных циклах.
class MyTest {
    public static void main(String args[]) {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Cчeтчик внешнего цикла: " + i);
            System.out.print("Счетчик внутреннего цикла: "); // Чтобы в одну строчку.
            int t = 0;
            while (t < 20) {

                if (t == 11) break; // Прервать цикл, если t = 10.
                System.out.print(t + "_");
                t++;
            }
            System.out.println();
        }
        System.out.println("Циклы завершены.");
    }
}