// Преобразование прописных букв английского алфавита в строчные
class LowCase {
    public static void main(String[] args) {
        char ch;

        for (int i = 0; i < 20; i++) {
            ch = (char) ('A' + i);
            System.out.print(ch);

            // В результате установки в единицу шестого бита значения
            // переменной ch она всегда будет содержать прописную букву
            ch = (char) ((int) ch | 32);
            System.out.print(ch + " ");
        }
    }
}