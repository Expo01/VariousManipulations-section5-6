import java.util.Scanner;


//------PART 2 CONTENT??------
//SWITCH: method with if criteria, if valid, parameter used as switch test parameter in infinite while loop
//  which remains valid with string input (use '.toLowerCase' inbuilt method ) but exits if no string.
//  Both singular and multiple case conditions with some case outputs including nested if/else condition for output which
//return a number from the switch cases into boolean statement for '.hasNextInt' from Scanner class and use scanner
// in infinite while loop with boolean flag (MinMaxChallenge). When min and max

//WHILE STATEMENT: Do while loop (whileVsDoWhile). Use of continue keyword (isEvenWhileLoop). Counter variable.


public class Color {
    private static Scanner stringScanner = new Scanner(System.in);

    public static void stringTest() {
        if (stringScanner.hasNext()) {
            colorIntValue(stringScanner.nextLine());
        } else {
            System.out.println("string values only");
        }
    }

    public static void colorIntValue(String testString) {

        switch (testString.toLowerCase()) {
            case "red":
                minMax(1);
                break;
            case "orange":
                minMax(2);
                break;
            case "yellow":
                minMax(3);
                break;
            case "green":
                minMax(4);
                break;
            case "blue":
                minMax(5);
                break;
            case "purple":
                minMax(6);
                break;
            case "white":
            case "grey":
            case "black":
                minMax(7);
                break;
            default:
                System.out.println("this color not acceptable input");
                break;
        }
    }

    public static void minMax(int nextInt) {
        System.out.println("I'm out of ideas of contrived ways to demonstrate stuff but here is the number " + nextInt);
    }
}
