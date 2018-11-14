package com.olhastfn.tasks.task1223;

/**
 * Created on 07.11.2018.
 */
public class Solution {
    public static void main(String[] args) {
        Pet pet = new Cat();
        pet.setName("");
        System.out.println(pet.getName());
    }

    public static class Pet {
        protected String name;

        public Pet(){

        }

        public final String getName(){
            return name;
        }

        public void setName(String name){
            this.name= name;
        }
    }

    public static class Cat extends Pet {
        @Override
        public void setName(String name) {
            super.setName(name);
        }
    }
}
