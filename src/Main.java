import java.util.Scanner;

public class Main {

    public static Scanner intScanner = new Scanner(System.in);

    public static void main(String[] args) {
        numberToWords();

    }

    public static void numberToWords() {
        int counter = 0;
        System.out.println("input 5 integers");
        while (counter < 5) {
            counter++;
            int testInt = intScanner.nextInt();
            if (testInt < 1) {
                System.out.println("invalid number");
            }

            System.out.println("the spelling of the digits of " + testInt + " is");

            int reversed = reverse(testInt);
            int savedReversed = reversed;
            while (reversed > 0) {
                int digit = reversed % 10;
                reversed /= 10;

                switch (digit) {
                    case 0:
                        System.out.println("zero");
                        break;
                    case 1:
                        System.out.println("one");
                        break;
                    case 2:
                        System.out.println("two");
                        break;
                    case 3:
                        System.out.println("three");
                        break;
                    case 4:
                        System.out.println("four");
                        break;
                    case 5:
                        System.out.println("five");
                        break;
                    case 6:
                        System.out.println("six");
                        break;
                    case 7:
                        System.out.println("seven");
                        break;
                    case 8:
                        System.out.println("eight");
                        break;
                    case 9:
                        System.out.println("nine");
                        break;

                }
            }
            if (getDigitCount(savedReversed) != getDigitCount(testInt)) {
                for (int i = getDigitCount(savedReversed); i < getDigitCount(testInt); i++) {
                    System.out.println("zero");
                }
            }
            System.out.println(" ");

            if (testInt == savedReversed) {
                System.out.println("and " + testInt + " is a palindrome");
            }
        }
        System.out.println("all 5 integers have been entered. Exiting the loop");
    }


    public static int reverse(int reverseThisNum) {
        if (reverseThisNum < 10 && reverseThisNum > -10) {
            return reverseThisNum;
        }

        int reverseNum = 0;
        int digit = 0;
        while (reverseThisNum > 0) {
            reverseNum *= 10;
            digit = reverseThisNum % 10;
            reverseNum += digit;
            reverseThisNum /= 10;
        }
        return reverseNum;

    }

    public static int getDigitCount(int numDigits) {
        int digitCount = 0;

        while (numDigits > 0) {
            digitCount++;
            numDigits /= 10;
        }
        return digitCount;
    }
}
