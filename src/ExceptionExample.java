package com.company;
import java.io.IOException;

public class ExceptionExample {
    //checked
    void checked() throws MyException,IOException,Exception, ArithmeticException, RuntimeException{
        throw new MyException();
    }
    //unchecked
    void checked1() throws ArithmeticException{
//        throw new ArithmeticException();
        System.out.println("from checked1");
    }

    void div(int a){
        float ans = 13 / a;
        System.out.println("from div ans = " + ans);
    }
    public static void main(String[] args) {
        ExceptionExample obj = new ExceptionExample();
        try {
            obj.div(0);
        }catch (ArithmeticException e){
            e.printStackTrace();
        }
        System.out.println("THis executes after catching the exception...");

        //checked
        try {
            obj.checked();
        }catch(ArithmeticException e){
            e.printStackTrace();
        }
        catch (RuntimeException e){
            e.printStackTrace();
        }
        catch(Exception e){
            e.printStackTrace();
        }


//       unchecked
        try {
            obj.checked1();
        }catch (ArithmeticException e){
            e.printStackTrace();
        }finally{
            System.out.println("This is finally. It always executes...");
        }

        System.out.println("This executes after handling the exception..");
    }
}


class MyException extends Exception {

}