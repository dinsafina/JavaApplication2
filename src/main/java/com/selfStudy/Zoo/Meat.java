package com.selfStudy.Zoo;

public class Meat extends Food {

    public int eat(Food food){
        satiety+= 10;
        return satiety;
    }

}
