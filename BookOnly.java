// Простая программа, демонстрирующая применение пакета.
// Этот файл является частью пакета bookpack.

// Класс Book, видоизмененный для открытого доступа
// Класс Book и некоторые его члены должны быть объявлены открытыми,
// чтобы ими можно было пользоваться в других пакетах.
/*
package bookpack;

public class BookOnly {
    protected String title;
    protected String author;
    protected int pubDate;  //now that variables inited as PROTECTED
    //Now constructor init as open
    public BookOnly(String t, String a, int d){
        title = t;
        author = a;
        pubDate = d;
    }
    //Now method is open
    public void show() {
        System.out.println(title);
        System.out.println(author);
        System.out.println(pubDate);
        System.out.println();
    }
}

// Пример использования модификатора protected
package bookpackext;
class ExtBookOnly extends bookpack.BookOnly {
    private String publisher;
}

// Класс BookDemo принадлежит пакету bookpack.
class BookDemo2 {
    public static void main(String[] args) {
        BookOnly books[] = new BookOnly[5];

        books[0] = new BookOnly("Bible", "God", 1000);
        books[1] = new BookOnly("Java", "Schildt", 2011);
        books[2] = new BookOnly("Python", "Barry", 2017);
        books[3] = new BookOnly("Art of War", "Sun Tzy", 700);
        books[4] = new BookOnly("Plastfoil", "Ivanov", 2018);

        for(int i = 0; i < books.length; i++) books[i].show();

    }
}
*/