// Нахождение минимального и максимального значений в массиве
// с помощью for each
class minMax {
    public static void main(String[] args) {
        int nums[] = new int[10];
        int min, max;
        nums[0] = 99;
        nums[1] = -10;
        nums[2] = 100123;
        nums[3] = 18;
        nums[4] = -978;
        nums[5] = 5623;
        nums[6] = 463;
        nums[7] = -9;
        nums[8] = 287;
        nums[9] = 49;
        min = max = nums[0];
        for (int i : nums) {
            if (i < min) min = i;
            if (i > max) max = i;
        }
        System.out.println("min и max: " + min + " " + max);
    }
}

