import java.util.Scanner;

class MyClass2 {

    static void sayHello(){
        System.out.println("Learn Java, Bitch!");
    }
    public static void main(String[] args) {
        String[] a = { "Каждый "," охотник "," желает "," знать "," где "," сидит "," фазан "};
        //Выводим изначальный массив в консоль
        for (int i=0; i<a.length; i++){
            System.out.print(a[i]);
        }
        System.out.println();

        int n = a.length;
        //Переменная, которая будет использоваться при обмене элементов
        String temp;

        for (int i = 0; i < n/2; i++) {
            temp = a[n-i-1];
            a[n-i-1] = a[i];
            a[i] = temp;
        }
        //Выводим конечный массив в консоль
        for (int i=0; i<a.length; i++){
            System.out.print(a[i]);
        }

        sayHello();

    }
}






