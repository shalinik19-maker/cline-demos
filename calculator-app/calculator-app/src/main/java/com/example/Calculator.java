package com.example;

/**
 * Hello world!
 *
 */
public class Calculator 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public int multiply(int a, int b) {
    return a * b;
}
 public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed");
        }
        return a / b;
    }


}
