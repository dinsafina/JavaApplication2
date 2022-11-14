package com.selfStudy.Zoo;

public class AnimalTest {
    public static void main(String[] args) {
        Horse burushka = new Horse("Бурушка");
        burushka.getAnimalName();

        Cow burenka = new Cow("Буренка");
        burenka.getAnimalName();

        Duck donald = new Duck("Дональд");
        donald.getAnimalName();

        Fish zlata = new Fish("Злата");
        zlata.getAnimalName();

        Lion simba = new Lion("Симба");
        simba.getAnimalName();

        Food meat = new Meat();
        Food grass = new Grass();

        //животные едят:
      burushka.eat(grass);
      burushka.eat(grass);
      //burushka.eat(meat); //выбрасывается NullPointerException
      burushka.getSatiety();

        burenka.eat(grass);
        burenka.eat(grass);
        //burenka.eat(meat);//выбрасывается NullPointerException
        burenka.getSatiety();

        donald.eat(grass);
        donald.getSatiety();

        zlata.eat(meat);
        zlata.eat(meat);
        zlata.getSatiety();

       simba.eat(meat);
       simba.eat(meat);
       //simba.eat(grass); //выбрасывается NullPointerException
        simba.getSatiety();



       //как сделать так, чтобы meat относился только ко льву, а grass только к утке?

    }
}
