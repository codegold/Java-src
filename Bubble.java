class Bubble {
    public static void main(String args[]) {
        int num[] = {99, 2772, -33, -44, 66, -999, 234, 654987, -987, 556};
        int a, b, t;
        int size;
        int table[][] = new int[10][20];

        size = 10; // количество сорируемых элементов.

        // Отобразить исходный массив.

        System.out.print("Исходный массив:");
        for (int i = 0; i < size; i++)
            System.out.print(" " + num[i]);
        System.out.println();

        // Реализовать алогоритм пузырьковой сортировки.
        for (a = 1; a < size; a++)
            for (b = size - 1; b >= a; b--) {
                if (num[b - 1] > num[b]) { // если требуемый порядок
                    // следования не соблюдается,
                    // поменять элементы местами
                    t = num[b - 1];
                    num[b - 1] = num[b];
                    num[b] = t;

                }
            }

        // Отобразить отсортированный массив
        System.out.println("Отcopтиpoвaнный массив: ");
        for (int i = 0; i < size; i++)
            System.out.print(" " + num[i]);
        System.out.println();
        System.out.println(table[3][5]);

    }
}