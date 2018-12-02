class MyTestStr178 {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        /*for (int i=0; i<10; i++) {
            sum += nums[i];*/

        //}


        for (int x : nums) {
            x = x * 10;
            sum += x;
            //if (x == 35) break;
            System.out.println("Значение х: " + x);
        }

        System.out.println(sum);
        System.out.println();
        for (int x : nums)
        System.out.println(x);
    }
}