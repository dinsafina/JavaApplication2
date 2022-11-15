package com.selfStudy.Zoo;

public class Employee {

    public void feed(Animal animal, Food food) {
        System.out.println("накормлен " + animal.getName() + " еда:" + food.getClass().getSimpleName());
    }


    public void getVoice(Animal animal) {
        animal.voice();
    }

    public void putInAviary(Animal animal) {
        System.out.println(animal.getName() + " в вольере");
    }

    public void inBigAviary(Animal animal) {
        if (animal.getSize() == "big" || animal.getSize() == "small") {
            System.out.println(animal.getName() + " в вольере BIG");
        } else {
            throw new NullPointerException("Неподходящий вольер");
        }


    }

    public void inSmallAviary(Animal animal) {
        if (animal.getSize() == "small") {
            System.out.println(animal.getName() + " в вольере SMALL");
        } else {
            throw new NullPointerException("Неподходящий вольер");
        }

        //какие возмжности дает наследование классов
    }
}
//как обозначить, что у лошади большой вольер а у утки маленький
// через размер животного? Если животное большое, то и вольер большой