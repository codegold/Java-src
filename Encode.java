// Использование поразрядной операции исключающего ИЛИ
// для шифрования и дешифрования сообщений
class Encode {
    public static void main(String[] args) {
        String msg = "This is a test";
        String encmsg = " ";
        String decmsg = "";
        int key = 88;

        System.out.print("Initial message: ");
        System.out.println(msg);

        // Зашифровать сообщение
        for (int i = 0; i < msg.length(); i++)
            // Построение зашифрованной строки сообщения
            encmsg = encmsg + (char) (msg.charAt(i) ^ key);

        System.out.print("Encrypted message: ");
        System.out.println(encmsg);

        // Дешифровать сообщение
        for (int i = 0; i < msg.length(); i++)
            // Построение дешифрованной строки сообщения
            decmsg = decmsg + (char) (encmsg.charAt(i) ^ key);

        System.out.print("Decrypted message: ");
        System.out.println(decmsg);


    }
}