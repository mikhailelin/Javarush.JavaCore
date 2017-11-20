package com.javarush.task.task12.task1226;

/* 
Лазать, летать и бегать
*/

public class Solution {

    public interface Fly{
        void fly();
    }
    public interface Climb{
        void climb();
    }
    public interface Run{
        void run();
    }

    public class Cat implements Run,Climb{
        @Override
        public void run() {
            int x=0;
        }

        @Override
        public void climb() {
            int x=0;
        }
    }

    public class Dog implements Run{
        @Override
        public void run() {
            int x=0;
        }
    }

    public class Tiger extends Cat {
    }

    public class Duck implements Fly,Run{
        @Override
        public void run() {
            int x=0;
        }

        @Override
        public void fly() {
            int x=0;
        }
    }
}
