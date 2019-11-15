package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int num;

        System.out.println("Please enter number:");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        triangle(num);

    }

    public static void triangle(int grid)
    {
        for (int i = 1; i <= grid ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("#");
            }
            System.out.println("");
        }
    }
}

