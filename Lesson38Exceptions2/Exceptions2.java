package Lesson38Exceptions2;

import java.io.IOException;
import java.util.Scanner;

public class Exceptions2 {
    public static void main(String[] args) throws ScannerException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int x = Integer.parseInt(scanner.nextLine());

            // Integer.parseInt будем преобразовывать в целые числа в примитивы
            // scanner.nextLine() - будем считывать так
            // int x =  поместим это число в переменную

            if (x != 0) {
                throw new ScannerException("You input something except zero!");

            }
        }
    }
}
