package com.geekbrains;

public class MainAnimal {
    public static void main(String[] args) {
        Animal animalCat = new Cat("Барсик", 200, 0);
        Animal animalDog = new Dog("Шарик", 500, 10);

        System.out.println("Имя кота: " + animalCat.getName("Барсик"));
        System.out.println("Пробежал - " + animalCat.getRun() + " метров");
        System.out.println("Проплыл - " + animalCat.getSwim() + " метров");
        System.out.println();
        System.out.println("Имя собаки: " + animalDog.getName("Шарик"));
        System.out.println("Пробежал - " + animalDog.getRun() + " метров.");
        System.out.println("Проплыл - " + animalDog.getSwim() + " метров");

    }
}
