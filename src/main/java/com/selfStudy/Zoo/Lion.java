package com.selfStudy.Zoo;

import static com.selfStudy.Zoo.Size.BIG;

public class Lion extends Animal implements Voicable {
    private final Size animalSize = BIG;

    public Size getAnimalSize() {
        return animalSize;
    }

    public Lion(String name, Size animalSize) {
        super(name, animalSize);
    }

    public void voice() {
        System.out.println("Ррррррр");
    }

    public int eat(Food food) {
        if (food instanceof Meat) {
            int satiety = this.getSatiety() + 5;
            this.setSatiety(satiety);
            return satiety;
        } else {
            throw new NullPointerException("Неправильная еда");
        }
    }
}
