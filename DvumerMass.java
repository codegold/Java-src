class Dvumer {
    public static void main(String args[]) {
        int sqrs[][] = {
                {1, 1},
                {2, 4},
                {3, 9},
                {4, 16},
                {5, 25},
                {6, 36},
        };
        int i, j;

        for (i = 0; i < 6; i++) {
            for (j = 0; j < 2; j++)
                System.out.print(sqrs[i][j] + "_");
            System.out.println();
        }
    }
}