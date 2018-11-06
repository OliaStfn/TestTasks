package com.olhastfn.tasks.task1214;

/**
 * Created on 06.11.2018.
 */
public class Solution
{
    public static void main(String[] args) {

    }


    public static abstract class Animal{
        public abstract String getName();
    }

    public class Cow extends Animal{
        @Override
        public String getName() {
            return "bla";
        }
    }
}
