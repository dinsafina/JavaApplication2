package com.selfStudy.Zoo;

public class Cow extends Animal implements Swimmable, Voicable {

    public Cow(String name){
        this.name = name;
    }

    public void swim(){
        System.out.println("Коровка плавает");
    }

    public void voice(){
        System.out.println("Му- му");
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
