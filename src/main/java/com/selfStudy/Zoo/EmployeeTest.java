package com.selfStudy.Zoo;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Cow burenka2 = new Cow("Буренка");
        Food meat = new Meat();
        Food grass = new Grass();

        emp1.feed(burenka2, grass);

        //burenka2.voice();
        emp1.getVoice(burenka2);

        //как написать метод в классе Employee, который будет вызывать метод voice из класса каждого животного
    }
}
