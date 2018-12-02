// Нахождение минимального и максимального значений в массиве
class ClassName {
    public static void main(String args[]) {
        int num[] = {99, 2772, -33, -44, 66, -999, 234};
        int min, max;

        min = max = num[0];
        for (int i = 1; i < 7; i++) {
            if (num[i] < min) min = num[i];
            if (num[i] > max) max = num[i];
        }
        System.out.println("min and max are: " + min + " " + max);


    }
}

