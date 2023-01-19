package com.serenitydojo;

public class Cat extends Pet {
    private String favoriteToy;

    public Cat (String name, String favoriteToy, int Age) {
        super(name, Age);
        this.favoriteToy = favoriteToy;
    }

    public String getFavoriteToy() {
        return favoriteToy;
    }

    @Override
    public String play(){
        return "plays with string";
    }

}
