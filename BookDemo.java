// Простая программа, демонстрирующая применение пакета.
// Этот файл является частью пакета bookpack.
package bookpack;
// Простая программа, демонстрирующая применение пакета.
// Этот файл является частью пакета bookpack.
class Book {
    private String title;
    private String author;
    private int pubDate;

    Book(String t, String a, int d){
        title = t;
        author = a;
        pubDate = d;
    }

    void show() {
        System.out.println(title);
        System.out.println(author);
        System.out.println(pubDate);
        System.out.println();
    }
}

// Класс BookDemo принадлежит пакету bookpack.
class BookDemo {
    public static void main(String[] args) {
        Book books[] = new Book[5];

        books[0] = new Book("Bible", "God", 1000);
        books[1] = new Book("Java", "Schildt", 2011);
        books[2] = new Book("Python", "Barry", 2017);
        books[3] = new Book("Art of War", "Sun Tzy", 700);
        books[4] = new Book("Plastfoil", "Ivanov", 2018);

        for(int i = 0; i < books.length; i++) books[i].show();

    }
}