package Lesson48Enum;

public class Test {
    //private static final int DOG = 0;
    //private static final int CAT = 1;
    //private static final int FROG = 2;


    public static void main(String[] args) {
        Animal animal = Animal.CAT;
        Season season = Season.WINTER;
        System.out.println(season);
        System.out.println(season.getTemperature());

        Season season1 = Season.AUTUMN;
        System.out.println(season1.name());
        System.out.println(animal.name());

        Animal frog = Animal.valueOf("FROG");
        System.out.println(frog.getTranslation());
        System.out.println();

        Season winter = Season.WINTER;
        System.out.println(winter.ordinal());


//        switch (animal) {
//            case DOG:
//                System.out.println("It's a dog");
//                break;
//            case CAT:
//                System.out.println("It's a cat");
//                break;
//            case FROG:
//                System.out.println("It's a frog");
//            default:
//                System.out.println("Not an animal");

//        //Так было раньше, до Enum!!!
//        int animal = 100;
//
//        switch (animal){
//            case DOG:
//                System.out.println("It's a dog");
//                break;
//            case CAT:
//                System.out.println("It's a cat");
//                break;
//            case FROG:
//                System.out.println("It's a frog");
//                default:
//                    System.out.println("Not an animal");
//        }

//        Season season = Season.SUMMER; //Саммер это обьект класса Сизон!

        //Object -> Enum -> Season

//        System.out.println(season instanceof Object);
//        System.out.println(season.getClass());

//        switch (season) {
//            case SUMMER:
//                System.out.println("It's hot!");
//                break;
//            case WINTER:
//                System.out.println("It's cold!");
//                break;
//        }




    }
}