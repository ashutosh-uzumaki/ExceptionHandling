package org.ashutosh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        /*
        try
        catch
        finally
        throw
        throws
         */

//        Scanner scn = new Scanner(System.in);
//        int dividend = scn.nextInt();
//        int divisor =  scn.nextInt();
//
//        try{
//            int answer = dividend / divisor;
//            System.out.println("the answer is "+answer);
//        }catch (ArithmeticException e){
//            System.out.println(e.getMessage());
//            System.out.println("Failed to divide");
//        }
//        int[] arr = new int[5];
//        try {
//            arr[6] = 10;
//        }catch(ArithmeticException ae){
//            System.out.println(ae.getMessage());
//        }catch(ArrayIndexOutOfBoundsException ie){
//            System.out.println(ie.getMessage());
//        }

//        int[] arr = new int[5];
//        try {
//            arr[6] = 10;
//        }catch(ArithmeticException | ArrayIndexOutOfBoundsException ae){
//            System.out.println(ae.getMessage());
//        }finally {
//            System.out.println("Finally Executed!");
//        }
        Scanner scn = new Scanner(System.in);
        System.out.print("Please enter your age: ");
        int age = scn.nextInt();

        if(age < 18){
            throw new RuntimeException("You are not eligible for voting!");
        }else{
            System.out.println("Hurray! You can vote!");
        }

        try{
            int result = divideNums(20, 0);
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }

    public static int divideNums(int a, int b)throws ArithmeticException{
        if(b == 0){
            throw new ArithmeticException("Cannot Divide By Zero!");
        }
        return a / b;
    }
}