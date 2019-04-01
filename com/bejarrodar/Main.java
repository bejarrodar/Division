package com.bejarrodar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Input the first number: ");
        int a = input.nextInt();
        System.out.print("Input the second number: ");
        int b = input.nextInt();
        int d = (a/b);
        int e = (a%b);
        System.out.println();
        System.out.println("The division of a and b is " +d +" with a remainder of " +e);
    }
}
