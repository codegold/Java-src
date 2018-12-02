// Использование расширенного цикла for
// для обработки двумерного массива

class ForEach {
    public static void main(String[] args) {
        int sum = 0;
        int nums[][] = new int[3][5];
        //Ввести ряд значений в массив nums.

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++)
                nums[i][j] = (i + 1) * (j + 1);

// Использовать разновидность for-each цикла for
// для суммирования и отображения значений.
// Обратите внимание на объявление переменной х.
            for (int x[] : nums) {
                for (int y : x) {
                    System.out.println("Значение: " + y);
                    sum += y;

                }
            }
            System.out.println("Sum: " + sum);

        }
    }
}