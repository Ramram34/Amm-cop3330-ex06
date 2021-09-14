/*
 *  UCF COP3330 Fall 2021 Assignment 6 Solution
 *  Copyright 2021 Rami Amm
 */

import java.util.Calendar;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int currentYear = Calendar.getInstance() .get(Calendar.YEAR);

        System.out.println("What is your age?");
        int age = in.nextInt();

        System.out.println("What age would you like to retire at?");
        int retirementAge = in.nextInt();

        int yearsLeft = retirementAge - age;
        int retirementYear = currentYear + yearsLeft;

        System.out.println("You have " + yearsLeft + " years until you can retire." + "\r\n" +
                            "It is " + currentYear + ", so you can retire in " + retirementYear + "!");


    }
}
