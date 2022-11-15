package com.selfStudy.Zoo;

public class Zoo {
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

        //Работник
        Employee emp = new Employee();
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
        emp.putInAviary(burenka);
        emp.putInAviary(donald);
        emp.putInAviary(zlata);
        emp.putInAviary(simba);
        emp.putInAviary(burushka);

         Aviary avBig = Aviary.BIG;
        System.out.println(avBig);

        System.out.println(burenka.getSize());

        System.out.println("***");
        emp.inBigAviary(burenka);
        //emp.inSmallAviary(burenka);  //выбрасывается NullPointerException

        emp.inBigAviary(burushka);
        //emp.inSmallAviary(burushka);  //выбрасывается NullPointerException

        emp.inBigAviary(zlata);
        emp.inSmallAviary(zlata);

        emp.inBigAviary(donald);
        emp.inSmallAviary(donald);

        emp.inBigAviary(simba);
        //emp.inSmallAviary(simba);  //выбрасывается NullPointerException
    }
}
