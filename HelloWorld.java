// Вычисление целых степеней числа 2
class Power {

    public static void main(String args[]) {
        int е;
        int result; //
        for (int i = 0; i < 10; i++) {
            result = 1;
            е = i; // повторяет i
            while (е > 0) {
                result *= 2;
                е--;
            }
            System.out.println("2 в степени " + i +
                    " равно " + result);

        }
    }
}


