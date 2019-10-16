package com.swing.Controller;

import java.util.Scanner;

public class Choices {



    public static String Choices(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n1. Do you fight");
        System.out.println("2. Do you drink a portion");
        System.out.println("3. Do you Run");
        String input = scanner.nextLine();
        return input;

    }

    public static String ChoicesOnTheMap(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nwhat would you like to do?");
        System.out.println("1. go up");
        System.out.println("2. go down");
        System.out.println("3. go left");
        System.out.println("4. go right");
        String input = scanner.nextLine();
        return input;

    }


    public static String ChooseAmar(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPlease choose a weapon?");
        System.out.println("1. Gun");
        System.out.println("2. Sword");
        String input = scanner.nextLine();
        return input;

    }
}
