package com.selfStudy.Zoo;

public class Lion extends Animal implements Voicable {

    public Lion(String name){
        this.name = name;
    }

    public void voice(){
        System.out.println("Лев рычит");
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
