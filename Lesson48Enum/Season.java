package Lesson48Enum;

public enum Season {
    SUMMER(35), WINTER(-30), AUTUMN(10), SPRING(20); //Это обьект Енама (класса) Сезон!

    private int temperature;

    Season(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature(){
        return temperature;
    }
}
