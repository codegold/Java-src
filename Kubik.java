class Kubik {
    int a;
    int b;
    int c;
    int summ;

    //конструктор
    Kubik(int side1, int side2, int side3) {
        a = side1;
        b = side2;
        c = side3;
        summ = a * b * c;
    }

    // 1method: Compare by size
    boolean sameSize(Kubik ob) {
        if((ob.a == a) & (ob.b == b) & (ob.c == c)) return true;
        else return false;
    }

    // 2 method: Compare by volume.
    boolean sameSumm(Kubik ob) {
        if(ob.summ == summ)return true;
        else return false;
    }
}

class Objects { //Здесь будем добавлять новый объекты/фигуры.
    public static void main(String[] args) {
        Kubik ob1 = new Kubik(5, 4, 3);
        Kubik ob2 = new Kubik(5, 4, 3);
        Kubik ob3 = new Kubik(6, 4, 2);

        System.out.println("ob1 имеет те же размеры что и ob2: " +
                ob1.sameSize(ob2));
        System.out.println("ob1 имеет те же обьем что и ob2: " +
                ob1.sameSumm(ob2));
        System.out.println("ob1 имеет тот же обьем что и ob3: " +
                ob1.sameSumm(ob3));
    }

}
