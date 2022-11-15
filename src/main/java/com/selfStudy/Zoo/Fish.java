package com.selfStudy.Zoo;

public class Fish extends Animal implements Swimmable {

    private final String size = "small";
    public Fish(String name){
        this.name = name;
    }

    public String getSize() {
        return size;
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

    @Override
    public void voice() {
        System.out.println();
    }
}
