package Lesson34WildcardsGeneric;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List <Animal> listOfAnimal = new ArrayList<>();
        listOfAnimal.add(new Animal(1));
        listOfAnimal.add(new Animal(2));

        List<Dog> listOfDogs = new ArrayList<>();
        listOfDogs.add(new Dog());
        listOfDogs.add(new Dog());

        test(listOfAnimal);
        test(listOfDogs);
    }
    /*
    List<? extends Animal> list - означает  Animal и все потомки(кто ниже)
    List<? super Animal> list - мы хоти видеть все классы Animal и выше
    Я в видео немного неясно изъяснился.
Если мы пишем <? super Animal> , то мы разрешаем подавать на вход метода лист, содержащий объекты
класса Animal и всех суперклассов(родительских классов) класса Animal. В нашем случае, у класса Animal
только один родительский класс - класс Object.
То есть, в этом листе могут хранится объекты класса Animal и объекты класса Object.

Почему же тогда мы не можем вызывать методы класса Animal внутри метода?
А по той причине, что мы разрешаем хранить в этом листе объекты класса Object, у которых нет методов,
определенных в классе Animal.
Поэтому всегда, когда в wildcard мы пишем super, мы будем иметь доступ только к методам самого общего
родителя, класса Object.﻿
     */
    public static void test(List<? extends Animal> list) {
        for (Animal animal: list) {
            animal.eat();

        }

    }
}
