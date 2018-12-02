import  java.util.Scanner;

class test_weight {
    public static void main(String[] args) {
        double weightUser, weightMars, marsKf;
        System.out.println("Данная программа рассчитает ваш вес на Марсе c учетом гравитации.");
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Пожалуйста, введите Ваш вес:");
        weightUser = myScanner.nextDouble();
        marsKf = 0.17;

        weightMars = weightUser * marsKf;
        System.out.println("Ваш вес на Марсе составит " + weightMars + " кг.");

        char ch;
        ch = 'x';
        System.out.println("Ch contains " + ch);
        ch++;
        System.out.println("Now ch contains " + ch);

        ch = 89;
        System.out.println("Now ch contains " + ch);

        System.out.println("Result of 10 > 9: " + (10 > 9));




        //System.out.println(myScanner.nextDouble());
    }
}