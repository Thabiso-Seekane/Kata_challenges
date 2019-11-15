package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int num;

	System.out.println("Enter number of your choice:");
	Scanner input = new Scanner(System.in);
	num = input.nextInt();
	pyramid(num);
    }
	public static void pyramid(int height)
	{
		for (int i = 1; i <= height; i++) {

//			a for loop that gives us the  space before printing out the hash
			for (int j = i; j<height; j++)
				System.out.print(" ");
			/*this is the main loop where when i is two k is one
					it will print two extra stars.*/

			for (int k = 1; k <(i*2); k++)
				System.out.print("#");
			System.out.print("\n");
		}
	}

}

