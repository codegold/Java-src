package Lesson39Exception3;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class Exception3 {
    public static void main(String[] args) {
        //Checked (Compile time exception) = исключит случаи в работе программы
        //Unchecked (Runtime exception) = ошибка в работе программы

        try {
            run();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public static void run() throws IOException, ParseException, IllegalArgumentException {

    }
}
