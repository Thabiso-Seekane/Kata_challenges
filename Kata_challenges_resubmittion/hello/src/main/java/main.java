import java.util.Scanner;
public class main {

    public static String hello()
    {
        String name;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your Surname:");
        name = input.nextLine();

        return ("hello Mr " + name);
    }
        public static void main(String[] args) {

            System.out.println(hello());
        }
    }
