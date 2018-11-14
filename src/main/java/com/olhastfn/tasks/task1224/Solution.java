package com.olhastfn.tasks.task1224;

/**
 * Created on 07.11.2018.
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjType(new Cat()));
        System.out.println(getObjType(new Tiger()));
        System.out.println(getObjType(new Lion()));
        System.out.println(getObjType(new Bull()));
        System.out.println(getObjType(new Pig()));

    }

    public static String getObjType(Object o){
        if(o instanceof Cat)return "Cat";
        else if(o instanceof Tiger) return "Tiger";
        else if(o instanceof Lion)return "Lion";
        else if(o instanceof Bull) return "Bull";
        else if(o instanceof Pig) return "Pig";
        return "Unknown";
    }
    public static class Cat{}
    public static class Tiger{}
    public static class Lion{}
    public static class Bull{}
    public static class Pig{}
}
