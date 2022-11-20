package com.selfStudy.Zoo;

public class Employee {

    public void feed(Animal animal, Food food) {
        System.out.println("накормлен " + animal.getName() + " еда:" + food.getFoodName());
    }

    public void getVoice(Animal animal) {
        animal.voice();
    }

    public void putInAviary(Aviary aviary, Animal animal) {
        if (aviary.getAviarySize().equals(animal.getAnimalSize())) {
            System.out.println(animal.getName() + " в вольере " + aviary.getAviarySize());
        } else {
            throw new IllegalArgumentException("Неподходящий вольер");
        }
    }
}