//Игра в угадывание букв, четвертая версия
class Guess4 {
    public static void main(String args[])
            throws java.io.IOException { // Обработка ошибок.
        char ch, ignore, answer = 'S';
        do {
            System.out.println("Зaдyмaнa буква из диапазона A-Z.");
            System.out.print("Пoпытaйтecь ее угадать: ");
// Получить символ с клавиатуры.
            ch = (char) System.in.read();
// Отбросить все остальные символы во входном буфере.
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');
            if (ch == answer) System.out.println("** Правильно! **");
            else {
                System.out.print(" ... Извинитe, нужная буква находится ");
                if (ch < answer)
                    System.out.println("ближe к концу алфавита");
                else System.out.println("ближe к началу алфавита");
                System.out.println("Пoвтopитe попытку!\n");
            }
        } while (answer != ch);
    }
}