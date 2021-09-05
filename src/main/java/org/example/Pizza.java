package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jeremy Rosales
 */
public class Pizza
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        int people, pizzas, slices, left;

        System.out.print("How many people? ");
        people = input.nextInt();
        System.out.print("How many pizzas do you have? ");
        pizzas = input.nextInt();
        System.out.print("How many slices per pizza? ");
        slices = input.nextInt();
        slices = slices * pizzas;

        System.out.printf("%d people with %d pizzas (%d slices)\n", people, pizzas, slices);
        System.out.printf("Each person gets %d pieces of pizza.\n", slices/people);
        System.out.printf("There are %d leftover pieces.", slices%people);
    }
}
