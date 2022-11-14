package com.selfStudy.Zoo;

public abstract class Animal{
    protected String name;
    public int satiety;


    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void getAnimalName(){
        System.out.println(getName());
    }

    public abstract int eat(Food food);

//    public int eat(Food food){
//        satiety+= 10;
//        return satiety;
//    }

    public void getSatiety(){
        System.out.println(satiety);
    }


}
