package org.example.singleton;

public class SingletonClass {

    //Instance is created only once and this is private, so it can't be accessed from outside
    private static SingletonClass instance = new SingletonClass();

    //This is private, so it can't be accessed from outside
    private SingletonClass(){

    }

    //Everytime same object will be supplied
    public static SingletonClass getInstance(){
        return instance;
    }

    public void print(){
        System.out.println("HashCode of Singleton Object : "+ instance);
    }

}
