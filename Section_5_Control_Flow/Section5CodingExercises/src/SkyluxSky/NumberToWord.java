package SkyluxSky;

public class NumberToWord {

    public static void numberToWords(int number) {

        if (number < 0) {
            System.out.println("Invalid Value");
        }

        int reverseNumber = reverse(number);
        for (int i = 0; i < getDigitCount(number); i++) {

            switch (reverseNumber % 10) {
                case 0:
                    System.out.print("Zero ");
                    break;
                case 1:
                    System.out.print("One ");
                    break;
                case 2:
                    System.out.print("Two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("Four ");
                    break;
                case 5:
                    System.out.print("Five ");
                    break;
                case 6:
                    System.out.print("Six ");
                    break;
                case 7:
                    System.out.print("Seven ");
                    break;
                case 8:
                    System.out.print("Eight ");
                    break;
                case 9:
                    System.out.print("Nine ");
                    break;
                default:
                    break;
            }
            reverseNumber /= 10;
        }

        System.out.println();
    }

    //Reverses number
    public static int reverse(int number) {

        int reverseNumber = 0;

        while (number != 0) {
            // First you need calculate last digit of the number
            int lastDigit = number % 10;
            // If you have last digit you need calculate reverse number. Reverse number was
            // calculated in this pattern actual reverseNumber = reverseNumber * 10 + last Digit.
            reverseNumber = (reverseNumber * 10) + lastDigit;
            //The last step you need to take is to delete the last digit from the number
            //Simpler way: number = number / 10
            number /= 10;
        }
        return reverseNumber;
    }

    public static int getDigitCount(int number) {

        if (number < 0) {
            return -1;
        }

        int counter = 1;
        while (number > 9) {
            number /= 10;
            counter++;
        }
        return counter;
    }
}
