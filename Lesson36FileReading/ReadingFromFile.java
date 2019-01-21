package Lesson36FileReading;

import javax.swing.text.StyledEditorKit;
import java.io.*;
import java.util.*;
import java.lang.*;
import javax.swing.text.rtf.RTFEditorKit;



    public class ReadingFromFile {
        public static void main(String[] args) throws FileNotFoundException {
            //Все что ниже нужно только если считываемый файл лежит вне папки
            //с проектом. Например на рабочем столе!!!!
            //String separator = File.separator;
            //String path = separator + "Users" + separator + "aa" + separator + "Desktop" + separator + "test.txt";

            File file = new File("test.txt");

            Scanner scanner = new Scanner(file);/*
            while (scanner.hasNextLine()){
                System.out.println(scanner.hasNextLine());
            }
            */
            String line = scanner.nextLine();
            String[] numbersString = line.split(" "); //Создаем Массив класса Стринг и в скобках на что сплититть
            // и вызываем на нашей строке метод Сплит. Массив чисел представляется как строки
            int[] numbers = new int[numbersString.length];
            int counter = 0;
            for(String number : numbersString) {
                numbers[counter++] = Integer.parseInt(number); //Поммещаем конечный примитив типа инт в массив Намберс
            }

            System.out.println("Array size is " + counter); //Метод туСтринг - т.к. не может вывести сразу массив на экран

            scanner.close();
        }
    }
