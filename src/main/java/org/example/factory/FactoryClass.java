package org.example.factory;

public class FactoryClass {
    public Profession getProfession(String profession){
        if("F".equalsIgnoreCase(profession)){
            return new Farmer();
        } else if ("T".equalsIgnoreCase(profession)) {
            return new Teacher();
        }
        return null;
    }
}
