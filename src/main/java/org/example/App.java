package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Christian Williams
 */

public class App
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.print("What is the order amount? ");
        int order = input.nextInt();
        input.nextLine();
        System.out.print("What state do you live in? ");
        String state = input.nextLine();

        double taxRate = 0;
        if(state.equalsIgnoreCase("wi") || state.equalsIgnoreCase("wisconsin")){
            taxRate = 0.05;
            System.out.print("What county do you live in? ");
            String county = input.nextLine();
            if(county.equalsIgnoreCase("dunn")){
                taxRate += 0.004;
            }
            else if(county.equalsIgnoreCase("eau claire")){
                taxRate += 0.005;
            }
        }
        else if(state.equalsIgnoreCase("il") || state.equalsIgnoreCase("illinois")){
            taxRate = 0.08;
        }

        double total = order + (order * taxRate);
        System.out.print("The tax is $" + String.format("%.2f", (taxRate * 10)) + ".\nThe total is $" + String.format("%.2f", total));
    }
}