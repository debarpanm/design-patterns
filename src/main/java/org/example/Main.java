package org.example;

import org.example.factory.FactoryClass;
import org.example.factory.Profession;
import org.example.singleton.SingletonClass;

public class Main {
    public static void main(String[] args) {

        //Singleton Design Pattern
        SingletonClass singletonClass = SingletonClass.getInstance();
        singletonClass.print();

        //Factory Design Pattern
        //We don't access the necessary object directly, instead we call the factory class
        FactoryClass factory = new FactoryClass();
        Profession farmer = factory.getProfession("F");
        Profession teacher = factory.getProfession("T");
        farmer.print();
        teacher.print();

    }
}