package com.javarush.task.task12.task1227;

/* 
Fly, Run, Swim для классов Duck, Penguin, Toad
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface Fly {
        public void fly();
    }

    public interface Run {
        public void run();
    }

    public interface Swim {
        public void swim();
    }

    public class Duck implements Fly,Run,Swim{
        @Override
        public void swim() {
            int x=0;
        }

        @Override
        public void run() {
            int x=0;
        }

        @Override
        public void fly() {
            int x=0;
        }
    }

    public class Penguin implements Run,Swim {
        @Override
        public void swim() {
            int x=0;
        }

        @Override
        public void run() {
            int x=0;
        }
    }

    public class Toad implements Swim{
        @Override
        public void swim() {
            int x =0;
        }
    }
}
