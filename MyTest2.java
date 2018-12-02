/*
Использовать вложенные циклы для нахождени я
делителей чисел о т 2 до 100
*/
class ReadSymb {
    public static void main(String args[])
            throws java.io.IOException {
        char choice, exit;
        int space;
        exit = '.';
        space = 0;
        System.out.println("Press any key please. Press '.' for exit:");
        for (; ; ) {
            choice = (char) System.in.read(); // Получили символ от пользователя.
            if (choice == ' ') {
                space += 1; // Добавили пробел если он был нажат.
            } else if (choice == '.') {
                System.out.print("Programm stopped by exit. " +
                        "Space pressed " + space + " times."); /* Закончили на точке и показали пробелы. */
                break;
            }
        }
    }
}



