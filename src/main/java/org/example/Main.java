package org.example;

import org.example.singleton.SingletonClass;

public class Main {
    public static void main(String[] args) {

        //Singleton Design Pattern
        SingletonClass singletonClass = SingletonClass.getInstance();
        singletonClass.print();
    }
}