// Чтение символа с клавиатуры
class КbIn {
    public static void main(String args[])
            throws java.io.IOException {
        char ch;
        System.out.print("Haжмитe нужную клавишу, а затем клавишу ENTER: ");
        ch = (char) System.in.read(); // получить символ
        System.out.println("Bы нажали клавишу " + ch);

    }
}