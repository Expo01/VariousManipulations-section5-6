import java.util.Scanner;

public class InfiniteLoop {

    public static void runBooleanLoop() {
        Scanner numScanner = new Scanner(System.in);

        int min = 0;
        int max = 0;
        boolean first = true;

        while (true) {
            System.out.println("enter a number");
            boolean isAnInt = numScanner.hasNextInt();

            if (isAnInt) {

                int nextInt = numScanner.nextInt();

                if (first) {
                    first = false;
                    min = nextInt;
                    max = nextInt;
                }

                if (nextInt > max) {
                    max = nextInt;
                }

                if (nextInt < min) {
                    min = nextInt;
                }

            } else {
                break;
            }
            numScanner.nextLine();
        }
        System.out.println("min number input was " + min + " and max number input was " + max);
        numScanner.close();
    }
}
