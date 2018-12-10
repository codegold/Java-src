//Обьекты передаются методам по ссылке.
class  Test213 {
    int a, b;
    Test213(int i, int j) {
        a = i;
        b = j;
    }
    /* Передача обьекта методу. Теперь переменные ob.a and ob.b
    обьекта, используемого при вызове, также будут изменяться. */

    void change(Test213 ob) {
        ob.a = ob.a + ob.b;
        ob.b = - ob.b;
    }
}

class CallByRef {
    public static void main(String[] args) {
        Test213 ob = new Test213(15, 20);

        System.out.println("ob.a and ob.b before call: " + ob.a + " " + ob.b);

        ob.change(ob);
        System.out.println("ob.a and ob.b after call: " + ob.a + " " + ob.b);
    }
}