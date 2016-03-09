package com.company;

/**
 * Created by svitlana on 3/9/16.
 */
public class Euqlid {

    // Euclid's algorithm = the max common divisor of two integers
    public static int euqlid(int num1, int num2) {

        System.out.printf("num1: %d num2: %d \n", num1, num2);

        if (num2 == 0) {
            return num1;
        }

        int r = num1 % num2;
        return euqlid(num2, r);
    }


    public static void main(String[] args) {
        // write your code here
        System.out.println(euqlid(1111111, 1234567));
    }
}
