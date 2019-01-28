package Lesson48Enum;

public enum Animal {
    DOG("dog"), CAT("cat"), FROG("frog");
    //Эквивалентно такой записи new DOG("dog")

    private String translation;

    Animal(String translation) {
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }
    @Override
    public String toString() {
        return "translate into russian " + translation;
    }


}
