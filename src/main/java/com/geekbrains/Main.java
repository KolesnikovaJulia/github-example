package com.geekbrains;

public class Main {

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

    public static class Animal {

        protected String name;
        protected int run;
        protected int swim;

        public Animal(String name, int run, int swim) {
            this.name = name;
            this.run = run;
            this.swim = swim;
        }

        public String getName(String name) {
            return name;
        }

        public int getRun() {
            return run;
        }

        public int getSwim() {
            return swim;
        }
    }

    public static class Cat extends Animal {
        public Cat(String name, int run, int swim) {
            super(name, run, swim);
        }
    }

    public static class Dog extends Animal {
        public Dog(String name, int run, int swim) {
            super(name, run, swim);
        }
    }
}
