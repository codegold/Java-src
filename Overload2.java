/* Автоматическое преобразование типов может влиять
на выбор перегружаемого метода.
*/
class Overload2 {
    void f(int x) { //f - it is method and int x - his parameter
        System.out.println("Inside f(int): " + x);
    }

    void f(double x) {
        System.out.println("Inside f(double): " + x);
    }

    void f(byte x) {
        System.out.println("Inside f(byte): " + x);
    }
}

class TypeConv {
    public static void main(String[] args) {
        Overload2 ob = new Overload2();

        int i = 10;
        double d = 10.1;
        byte b = 99;
        short s = 10;
        float f = 11.5F;

        ob.f(i); //call method ob.f(int)
        ob.f(d); //call method ob.f(double)
        ob.f(b); //call method ob.f(byte)  без  преобразования типов
        ob.f(s); //call method ob.f(int)  c  преобразованием типов
        ob.f(f); //call method ob.f(double)  c  преобразованием типов
    }
}