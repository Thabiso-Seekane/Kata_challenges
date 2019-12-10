import java.util.*;
public class main {
    public static void main(String[] args) {


        square obj = new square();
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number:");
        int grid = input.nextInt();

        obj.square(grid);

    }
}
