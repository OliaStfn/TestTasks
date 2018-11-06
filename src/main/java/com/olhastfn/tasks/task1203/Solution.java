package com.olhastfn.tasks.task1203;

/**
 * Created on 04.11.2018.
 */
public class Solution {
    public static void main(String[] args) {
        Pet pet1 = new Cat();
        Pet cat = pet1.getChild();
        System.out.println(cat instanceof Cat);

        Pet pet2 = new Dog();
        Pet dog = pet2.getChild();
        System.out.println(dog instanceof Dog);
    }

    public static class Pet {
        public Pet getChild() {
            return new Pet();
        }
    }

    public static class Cat extends Pet {
        @Override
        public Pet getChild() {
            return new Cat();
        }
    }

    public static class Dog extends Pet {
        @Override
        public Pet getChild() {
            return new Dog();
        }
    }
}
