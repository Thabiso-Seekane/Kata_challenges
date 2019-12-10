import java.util.Scanner;

public class main {
    public static int even_or_odd(int num1)
    {
        if(num1 %2 == 0)
        {
            System.out.println("The number entered is Even.");
        }
        else
        {
            System.out.println("The number entered is Odd");
        }
        return num1;
    }

    public static void main(String[] args) {
        int num;

        System.out.println("Please enter a number:");
        Scanner input = new Scanner(System.in);

        num = input.nextInt();
        even_or_odd(num);
    }
}
