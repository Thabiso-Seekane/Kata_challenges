public class square {

    public static void square(int grid) {
        for (int i = 1; i <= grid; i++) {
            for (int j = 1; j <= grid; j++) {
                System.out.print("#");
            }
            System.out.println(" ");
        }
    }
}
