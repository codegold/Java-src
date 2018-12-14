//Возврат объекта типа String
class ErrMsg1 {
    String msgs[] = {
            "Output error",
            "Input error",
            "Out of disc free space",
            "Out of range limits"
    };

    String getErrMsg1(int i) { // method
        if(i >=0 & i < msgs.length)
            return msgs[i];
        else
            return "Unknown error code";

    }
}

class ErrorMsg {
    public static void main(String[] args) {
        ErrMsg1 err = new ErrMsg1();

        System.out.println(err.getErrMsg1(2));
        System.out.println(err.getErrMsg1(72));
    }
}