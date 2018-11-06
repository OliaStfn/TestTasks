package com.olhastfn.tasks.task1222;

/**
 * Created on 06.11.2018.
 */
public class Solution {


    public class Pet{
        public String getName(){
            return "Пушистік";
        }
    }

    public class Cat extends Pet{
        @Override
        public String getName() {
            return "i`m cat";
        }
    }
}
