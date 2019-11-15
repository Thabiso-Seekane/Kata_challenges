package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	 int num;
        System.out.println("Please enter number:");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        even_odd(num);
    }
    public static void even_odd(int num1)
    {
        if(num1 %2 == 0)
        {
            System.out.println("The number is Even bro!!");
        }
        else
        {
            System.out.println("The number is Odd dwgy!!");
        }

    }
}
