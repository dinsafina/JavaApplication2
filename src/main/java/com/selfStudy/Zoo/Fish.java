package com.selfStudy.Zoo;

public class Fish extends Animal implements Swimmable {

    public Fish(String name){
        this.name = name;
    }

    public void swim(){
        System.out.println("Рыбка плывет");
    }

    public int eat(Food food) {
        if (food instanceof Meat) {
            satiety += 10;
        } else{
            throw new NullPointerException("Неправильная еда");
        }
        return satiety;
    }

}
