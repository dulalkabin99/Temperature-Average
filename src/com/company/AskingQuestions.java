package com.company;

import java.util.Scanner;

public class AskingQuestions
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);

        double num1, num2;

        System.out.print( "First temperature? " );
        num1 = keyboard.nextDouble();

        System.out.print( "Second temperature? " );
        num2 = keyboard.nextDouble();
//algorithm to add two float and divide it by 2
        System.out.println("The average of Temp1 and Temp2 is : " + (num1 + num2)/2);
    }
}
