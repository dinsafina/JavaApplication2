package com.selfStudy.Zoo;

public class Horse extends Animal implements Swimmable, Voicable {

    public Horse(String name, Size animalSize) {
        super(name, animalSize);
    }

    @Override
    public void swim() {
        System.out.println("Лошадка плавает");
    }

    @Override
    public void voice() {
        System.out.println("Иго- го");
    }

    public int eat(Food food) {
        if (food instanceof Grass) {
            int satiety = this.getSatiety() + 5;
            this.setSatiety(satiety);
            return satiety;
        } else {
            throw new IllegalArgumentException("не верный тип еды");
        }
    }
}
