// Присваивание ссылок на массивы
class myTestStr171 {
    public static void main(String args[]) {
        int i, j, y;
        int nums1[] = new int[10];
        int nums2[] = new int[10];
        int nums3[][][] = new int[2][4][6];

        for (i = 0; i < nums1.length; i++)
            nums1[i] = i * i;

        for (i = 0; i < nums2.length; i++)
            nums2[i] = -i;

        //for (i=0; )

        System.out.print("Maccив nums1: ");
        for (i = 0; i < 10; i++)
            System.out.print(nums1[i] + " ");
        System.out.println();

        System.out.print("Maccив nums2: ");
        for (i = 0; i < 10; i++)
            System.out.print(nums2[i] + " ");
        System.out.println();

        nums2 = nums1; // теперь обе переменные ссылаются на массив nums1
        System.out.print("Maccив nums2 после присвоения: ");
        for (i = 0; i < 10; i++)
            System.out.print(nums2[i] + " ");
        System.out.println();

        // Выполнить операции над массивом nums1
        // через переменную nums2
        nums2[3] = 99;

        System.out.print("Maccив nums1 после изменения через nums2: ");
        for (i = 0; i < 10; i++)
            System.out.print(nums1[i] + " ");
        System.out.println();
        //System.out.println(nums1.length);

        // Копировать массив numsl в массив nums2
        if(nums2.length >= nums1.length)
            for(i=0; i < nums2.length; i++)
                nums2[i] = nums1[i];

        for(i=0; i < nums2.length; i++)
            System.out.print(nums2[i] + " ");


    }
}