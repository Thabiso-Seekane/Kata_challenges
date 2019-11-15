package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        System.out.println("Please enter a number:");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        square(num);
    }

    public static void square(int grid)
    {
        for (int i = 1; i <= grid ; i++) {
            for (int j = 1; j <= grid ; j++) {
                System.out.print("#");
            }
            System.out.println("");
        }
    }
}
