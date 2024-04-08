package org.example;

public class App {

    public static String FizzBuzz(int a) {
        String Output = " ";
        if(a%3==0)
            Output="Fizz";
        else if(a%5==0)
            Output="Buzz";
        return Output;
        }
        public static void main (String[] args)
        {
            System.out.println("Hello World!");
        }
    }