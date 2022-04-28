package com.company;


interface Interface1{
    default void method1(){
        System.out.println("Default method1");
    }
    static void method2(){
        System.out.println("from method2");
    }
    void method();

    default void display(){

    }
}

public class InterfaceExample implements Interface1  {

    @Override
    public void method() {
        System.out.println("This is from  child class");
    }
    public static void main(String[] args) {
        Interface1 obj = new InterfaceExample();
        obj.method();
        obj.method1();
        Interface1.method2();
    }
}

