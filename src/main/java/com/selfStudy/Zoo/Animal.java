package com.selfStudy.Zoo;

public abstract class Animal{
    protected String name;
    public int satiety;

    private String size;
    public abstract String getSize();
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

    public void getSatiety(){
        System.out.println(satiety);
    }

    public abstract void voice();




}
