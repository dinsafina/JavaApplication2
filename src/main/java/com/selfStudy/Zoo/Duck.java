package com.selfStudy.Zoo;

public class Duck extends Animal implements Swimmable, Voicable, Flyable {

    public Duck(String name){
        this.name = name;
    }

    public void swim(){
        System.out.println("Уточка плавает");
    }

    public void voice(){
        System.out.println("Кря-кря!");
    }

    public void fly(){
        System.out.println("Уточка летает");
    }

    public int eat(Food food) {
        if (food instanceof Grass) {
            satiety += 5;
        } else{
            throw new NullPointerException("Неправильная еда");
        }
        return satiety;
    }
}
