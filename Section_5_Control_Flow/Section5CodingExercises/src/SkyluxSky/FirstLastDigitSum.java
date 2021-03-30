package SkyluxSky;

public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {

        if (number < 0) {
            return -1;
        }

        //retrieves last digit of number
        int lastDigit = number % 10;

        //determines first digit - integers remove decimal value.
        while (number > 9) {
            number /= 10;
        }

        return lastDigit + number;
    }

}
