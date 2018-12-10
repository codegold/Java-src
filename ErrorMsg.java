//Возврат объекта типа String
class ErrorMsg {
    String msgs[] = {
            "Output error",
            "Input error",
            "Out of disc free space",
            "Out of range limits"
    };

    String getErrorMsg(int i) { // method
        if(i >=0 & i < msgs.length)
            return msgs[i];
        else
            return "Unknown error code";

    }
}

class ErrMsg {
    public static void main(String[] args) {
        ErrorMsg err = new ErrorMsg();

        System.out.println(err.getErrorMsg(2));
        System.out.println(err.getErrorMsg(72));
    }
}