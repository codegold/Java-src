// Применение оператора break с меткой
class Break4 {
    public static void main(String args[]) {
        int i;
        for (i = 1; i < 4; i++) {
            one:
            {
                two:
                {
                    three:
                    {
                        System.out.println("\ni равно " + i);
                        if (i == 1) break one; // Переход по метке.
                        if (i == 2) break two;
                        if (i == 3) break three;
                        // Эта строка кода никогда не будет достигнута.
                        System.out.println("нe будет выведено");
                        System.out.println("Пocлe блока three");
                    }
                    System.out.println("Пocлe блока two");
                }
                System.out.println("Пocлe блока one");
            }
            System.out.println("Пocлe цикла for");
        }
    }
}