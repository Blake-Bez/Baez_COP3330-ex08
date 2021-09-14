/*
 *  UCF COP3330 Fall 2021 Assignment 8 Solution
 *  Copyright 2021 Blake Baez
 */
package org.example;
import java.util.Scanner;

public class App 
{
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("How many people? ");
            int people = input.nextInt();
            System.out.print("How many pizzas do you have? ");
            int pizzas = input.nextInt();
            System.out.print("How many slices per pizza ");
            int slices = input.nextInt();

            int total = pizzas * slices;

            System.out.println(people + " people with " + pizzas + "(" + total + " slices)" );
            System.out.println("Each person gets " + (total/people) + " pieces of pizza.");
            System.out.println("There are " + (total%people) + " leftover pieces.");
        }
    }