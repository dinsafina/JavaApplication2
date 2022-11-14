package com.selfStudy.Zoo;

public class Horse extends Animal implements Swimmable, Voicable {

    public Horse(String name){
       this.name = name;
    }

    @Override
    public void swim(){
        System.out.println("Лошадка плавает");
    }

    @Override
    public void voice(){
        System.out.println("Лошадка ржет");
    }

    public int eat(Food food) {
        if (food instanceof Grass) {
            satiety += 10;
        } else{
            throw new NullPointerException("Неправильная еда");
        }
        return satiety;
    }
}
