package com.Company;

class C{
    int a;
    void show(){

        System.out.println("From show function:");
    }

    void add(int a,int b){
        int c=a+b;
        System.out.println("Adding two numbers :"+c);
    }

}

public class InheritanceExample extends C{
    void display(){

        System.out.println("rom Display:");

    }

    void add(int a,int b,int c){
        int z= a+b+c;
        System.out.println("Adding three numbers :"+z);
    }
    public static void main(String[] args){
        C c = new C();
        c.show();InheritanceExample inEx = new InheritanceExample();
        inEx.add(10,20);
        inEx.add(100,200,300);
    }
}
