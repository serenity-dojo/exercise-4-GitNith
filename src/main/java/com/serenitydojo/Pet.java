package com.serenitydojo;

public abstract class Pet {
    public String name;
    public int Age;

    public Pet(String name, int Age) {
        this.name=name;
        this.Age=Age;
    }

    public Pet() {

    }

    public String getName(){
        return name;
    }

    public int getAge() {
        return Age;
    }

    public abstract String play();
}
