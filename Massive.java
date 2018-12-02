

class Massive {
    public static void main(String args[]) {
        int i;
        int massive[] = new int[6];
        for (i = 0; i < massive.length; i++) {
            massive[i] = i * 10;
        }

        for (i = 0; i < massive.length; i++) {
            //System.out.println(massive[i] + " ");
        }
        massive[0] = 99;
        //System.out.println(massive[0]);

        String[] stroka = new String[3];
        stroka[0] = "Hi";
        stroka[1] = "Bye";
        stroka[2] = "Java";

        /*for (i = 0; i < stroka.length; i++) {
            System.out.println(stroka[i]);
        }*/
        System.out.println();

        for (String stroka2 : stroka) {  // 1 data type, 2 peremen name!!! : array name!!!
            System.out.println(stroka2);

        }
        int[] massive1 = {1, 2, 3};
        int sum = 0;
        for (int x : massive1) {
            sum = sum + x;
        }
        System.out.println();
        System.out.println(sum);
    }
}


