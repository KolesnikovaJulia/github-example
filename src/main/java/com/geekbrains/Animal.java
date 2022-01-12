package com.geekbrains;

public class Animal {
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
