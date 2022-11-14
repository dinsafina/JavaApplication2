package com.selfStudy.Zoo;

public class Grass extends Food {

    public int eat(Food food){
        satiety+= 5;
        return satiety;
    }
}
