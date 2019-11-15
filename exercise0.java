package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String name;
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your Surname:");
        name = input.nextLine();

        System.out.println("hello Mr " + name);
    }
}

