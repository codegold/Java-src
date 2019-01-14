// Простая программа, демонстрирующая применение пакета.
// Этот файл является частью пакета bookpack.

// Класс Book, видоизмененный для открытого доступа
// Класс Book и некоторые его члены должны быть объявлены открытыми,
// чтобы ими можно было пользоваться в других пакетах.

package bookpack;

class Book {
    // При объявлении этих переменных использован
    // модификатор доступа protected
    protected String title;
    protected String author;
    protected int pubDate;  //now that variables inited as PROTECTED
//Now constructor init as open
    public Book(String t, String a, int d){
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

        System.out.printf("This is string, %10d \n", 30);
        System.out.printf("This is string, %10d \n", 5);
        System.out.printf("This is string, %-10d \n", 30);
        System.out.printf("This is string, %-10d \n", 5);
        System.out.printf("This is string, %d \n", 5);
    }
}
