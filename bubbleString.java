/*Измените программу, написанную в упражнении 5.1, таким образом, чтобы она
сортировала массив символьных строк. Продемонстрируйте ее работоспособность.*/
class bubbleString {
    public static void main(String args[]) {
        String num[] = {"yes", "no", "love", "winter", "usa", "russia", "sensation", "dope"};
        int a, b;
        String t;
        int size;
        int table[][] = new int[10][20];

        size = num.length; // количество сорируемых элементов.

        // Отобразить исходный массив.

        System.out.print("Исходный массив:");
        for (int i = 0; i < size; i++)
            System.out.print(" " + num[i]);
        System.out.println();

        // Реализовать алогоритм пузырьковой сортировки.
        for (a = 1; a < size; a++)
            for (b = size - 1; b >= a; b--) {
                if (num[b - 1].compareTo(num[b]) >0) { // если требуемый порядок
                    // следования не соблюдается,
                    // поменять элементы местами
                    t = num[b - 1];
                    num[b - 1] = num[b];
                    num[b] = t;

                }
            }

        // Отобразить отсортированный массив
        System.out.print("Отcopтиpoвaнный массив: ");
        for (int i = 0; i < size; i++)
            System.out.print(" " + num[i]);
        System.out.println();
        System.out.println(table[3][5]);

    }
}