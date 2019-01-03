//Возврат объекта типа String
class ErrMsg1 {
    // Коды ошибок.
    // Константы объявляются с помощью ключевого слова final.

    final int OUTERR = 0;
    final int INERR = 1;
    final int DISKERR = 2;
    final int INDEXERR = 3;

    String msgs[] = {
    "Output error",
    "Input error",
    "Out of disc free space",
    "Out of range limits"
    };
    // Return Error message;
    String getErrMsg1(int i) { // method
        if(i >=0 & i < msgs.length)
            return msgs[i];
        else
            return "Unknown error code";

    }
}

class FinalD {
    public static void main(String[] args) {
        ErrMsg1 err = new ErrMsg1();

        // При вызове метода используются константы
        // объявленные с помощью ключевого слова final.

        System.out.println(err.getErrMsg1(err.OUTERR));
        System.out.println(err.getErrMsg1(err.DISKERR));

        /*System.out.println(err.getErrMsg1(2));
        System.out.println(err.getErrMsg1(72));
        */
    }
}