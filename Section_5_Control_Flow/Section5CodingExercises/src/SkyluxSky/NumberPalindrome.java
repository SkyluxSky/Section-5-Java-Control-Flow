package SkyluxSky;

public class NumberPalindrome {

    //Method reverses integer number
    public static boolean isPalindrome(int number){

        //makes number positive
        if (number < 0) {
            number *= -1;
        }

        int reverse = 0;
        //store current number
        int stored = number;

        //reverses number
        while (stored > 0) {
            // extract the least-significant digit
            int digit = stored % 10;
            reverse = (reverse * 10) + digit;
            // drop the least-significant digit
            stored /= 10;   // same as number = number / 10;
        }

        //Return if palindrome
        if (number == reverse) {

            return true;
        } else {

            return false;
        }

    }
}
