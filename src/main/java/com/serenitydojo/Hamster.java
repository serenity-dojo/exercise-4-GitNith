package com.serenitydojo;

public class Hamster extends Pet {
public String favoriteGame;

public Hamster(String name, String favoriteGame, int Age){
    super(name, Age);
    this.favoriteGame=favoriteGame;
}

@Override
public String play(){
    return "runs in wheel";
}

}
