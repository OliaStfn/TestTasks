package com.olhastfn.tasks.task1225;

/**
 * Created on 07.11.2018.
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjType(new Cat()));
        System.out.println(getObjType(new Tiger()));
        System.out.println(getObjType(new Lion()));
        System.out.println(getObjType(new Bull()));
        System.out.println(getObjType(new Cow()));
        System.out.println(getObjType(new Animal()));

    }

    public static String getObjType(Object o){
        if(o instanceof Cat)return "Cat";
        else if(o instanceof Tiger) return "Tiger";
        else if(o instanceof Lion)return "Lion";
        else if(o instanceof Bull) return "Bull";
        else if(o instanceof Cow) return "Cow";
        else if(o instanceof Animal) return "Animal";
        return "Unknown";
    }
    public static class Cat extends Animal{}
    public static class Tiger extends Animal{}
    public static class Lion extends Animal{}
    public static class Bull extends Animal{}
    public static class Cow extends Animal{}
    public static class Animal{}
}
