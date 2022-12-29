import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    //task: use scanner input to parse 5 ints from a string of >0 value. The digits of these ints are to be printed out in words.
    // If the number is a palindrome print that it is and additionally, print out all prime factors and return the largest prime factor of the palindrome.



    public static Scanner intScanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("enter your favorite color");
        Color.stringTest();

        InfiniteLoop.runBooleanLoop();

        numberToWords();

    }


    public static void numberToWords() {
        int counter = 0;
        System.out.println("input 5 integers");
        while (counter < 5) {
            counter++;
            int testInt = Integer.parseInt(intScanner.nextLine());
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
                System.out.println("and " + testInt + " is a palindrome and its largest prime number is " + getLargestPrime(testInt));
            }
        }
        System.out.println("all 5 integers have been entered. Exiting the loop");
    }

    public static int getLargestPrime(int number) { // might want to break this up, because right now its just one giant
        //ugly mega-method
        if (number <= 1) {
            return -1;
        }
        int largestPrime = 0;
        boolean isPrime = false;
        int primeSum = 0;
        int counter = 0;
        for (int h = 2; h < number / 2; h++) {
            if (number % h == 0) {
                for (int j = 2; j < h / 2; j++) {
                    if (h % j != 0) {
                        isPrime = true;
                        if (h > largestPrime) {
                            largestPrime = h;
                        }
                    }
                }
                if (isPrime) {
                    primeSum += h;
                    counter++;
                    System.out.println(h + " is a prime factor of " + number);
                }
            }
        }
        if (primeSum != 0) {
            System.out.println("the sum of the prime factors of " + number + " = " + primeSum);
            System.out.println("the average of the prime factors of " + number + " = " + Math.ceil(primeSum / counter));
            return largestPrime;
        } else {
            System.out.println(number + " has no prime factors");
            return -1;
        }
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

//        for (int i = 2; i < number; i++)                      RECURSION. Not sure how I'd print each prime and
//            if (number % i == 0) {                            reassign the largestPrime like this.
//                return getLargestPrime(number / i);
//            }
//        return number;
