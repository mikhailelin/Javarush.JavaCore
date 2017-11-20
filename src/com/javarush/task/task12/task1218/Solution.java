package com.javarush.task.task12.task1218;

/* 
Есть, летать и двигаться
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface Fly {
        public void fly();
    }

    public interface Move {
        public void move();
    }

    public interface Eat {
        public void eat();
    }

    public class Dog implements Eat,Move {
        public void move(){
            int x=0;
        }
        public void eat(){
            int y=0;
        }
    }

    public class Duck implements Eat,Move,Fly{
        public void move(){
            int x=0;
        }
        public void fly(){
            int z=0;
        }
        public void eat(){
            int y=0;
        }
    }

    public class Car implements Move {
        public void move(){
            int x=0;
        }
    }

    public class Airplane implements Fly, Move{
        public void move(){
            int x=0;
        }
        public void fly(){
            int z=0;
        }
    }
}
