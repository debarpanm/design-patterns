package org.example.factory;

public class Teacher implements Profession{
    @Override
    public void print() {
        System.out.println("Profession is Teacher");
    }
}
