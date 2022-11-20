package com.selfStudy.Zoo;

public class Zoo {
    public static void main(String[] args) {
        final Horse burushka = new Horse("Бурушка", Size.BIG);
        burushka.getAnimalName();

        final Cow burenka = new Cow("Буренка", Size.BIG);
        burenka.getAnimalName();

        final Duck donald = new Duck("Дональд", Size.SMALL);
        donald.getAnimalName();

        final Fish zlata = new Fish("Злата", Size.SMALL);
        zlata.getAnimalName();

        final Lion simba = new Lion("Симба", Size.BIG);
        simba.getAnimalName();

        final Food meat = new Meat("мясо");
        final Food grass = new Grass("трава");

        //животные едят:
        burushka.eat(grass);
        burushka.eat(grass);
        //burushka.eat(meat); // IllegalArgumentException
        System.out.println("***");
        System.out.println(burushka.getSatiety());

        burenka.eat(grass);
        burenka.eat(grass);
        //burenka.eat(meat);// IllegalArgumentException
        System.out.println(burenka.getSatiety());

        donald.eat(grass);
        System.out.println(donald.getSatiety());

        zlata.eat(meat);
        zlata.eat(meat);
        System.out.println(zlata.getSatiety());

        simba.eat(meat);
        simba.eat(meat);
        //simba.eat(grass); // IllegalArgumentException
        System.out.println(simba.getSatiety());

        donald.fly();

        //Работник
        final Employee emp = new Employee();
        emp.feed(burenka, grass);// сотрудник кормит животное
        emp.feed(donald, grass);
        emp.feed(zlata, meat);
        emp.feed(simba, meat);
        emp.feed(burushka, grass);

        emp.getVoice(burenka); // сотрудник просит животное подать голос
        emp.getVoice(donald);
        emp.getVoice(simba);
        emp.getVoice(burushka);

        //Вольер
        final Aviary aviaryBig = new Aviary(Size.BIG);
        final Aviary aviarySmall = new Aviary(Size.SMALL);

        emp.putInAviary(aviaryBig, burushka);
        //emp.putInAviary(aviaryBig, donald); // IllegalArgumentException
        emp.putInAviary(aviarySmall, zlata);
        emp.putInAviary(aviaryBig, burenka);
        emp.putInAviary(aviaryBig, simba);
    }
}

