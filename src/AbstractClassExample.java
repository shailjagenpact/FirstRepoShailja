
    package com.company;

    abstract class ABS{
        void display(){
            System.out.println("This is displayCall from Abstract Class");
        }
        abstract void show();
    }
    public class AbstractClassExample extends ABS {
        public void show(){
            System.out.println("This is showCall from child class");
        }
        public static void main(String[] args) {
            ABS obj = new AbstractClassExample();
            obj.show();
            obj.display();
        }
    }
