package com.olhastfn.tasks.task1205;


/**
 * Created on 04.11.2018.
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(getObj(new Cow()));
        System.out.println(getObj(new Dog()));
        System.out.println(getObj(new Whale()));
        System.out.println(getObj(new Pig()));
    }


    public static String getObj(Object obj) {
        if (obj instanceof Cow) {
            return "Cow";
        } else if (obj instanceof Pig) {
            return "Pig";
        } else if (obj instanceof Whale) {
            return "Whale";
        } else if (obj instanceof Dog) return "Dog";
        return "НЕвідомий";
    }

    public static class Cow {
    }

    public static class Dog {
    }

    public static class Whale {
    }

    public static class Pig {
    }
}
