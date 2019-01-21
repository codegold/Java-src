package Lesson37Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions1 {
    public static void main(String[] args)  {
        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("Found exception in MAIN method.");;
        }
    }

    public static void readFile() throws FileNotFoundException {
        File file = new File("ner");
        Scanner scanner = new Scanner(file);


    }
}
