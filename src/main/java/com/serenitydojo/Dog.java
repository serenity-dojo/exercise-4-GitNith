package com.serenitydojo;

public class Dog extends Pet{


 public String favoriteToy;



    public Dog(String name, String favoriteToy, int Age) {
        super(name, Age);
        this.favoriteToy = favoriteToy;

    }


    public String getFavoriteToy() {
        return favoriteToy;
    }

    @Override
    public String play() {
        return "plays with bone";
    }
}

