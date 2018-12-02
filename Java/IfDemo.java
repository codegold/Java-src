// Нахождение простых чисел в пределах от 2 до 100.
class Prime {
    public static void main(String args[]) {
        int i, j;
        boolean isprime;
        for(i=2; i < 10; i++) {
            isprime = true;
            // проверить, делится ли число без остатка
            for(j=2; j < i/j; j++)
                // если число делится без остатка, значит, оно простое
                if ( (i%j) == 0) isprime = false;
            if(isprime)
                System.out.println(i + " is prime.");
        }
    }
}