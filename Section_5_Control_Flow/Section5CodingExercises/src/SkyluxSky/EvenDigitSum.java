package SkyluxSky;

public class EvenDigitSum {

    public static int getEvenDigitSum (int number){

        if (number < 0){
            return -1;
        }

        int sum = 0;
        int remainder = 0;

        //searches through number for even digits, number /= 10 moves decimal point over one to the left.
        while (number > 0){
            remainder = number % 10;
            //if remainder % 2 == 0, then add remainder to sum.
            sum += (remainder % 2 == 0) ? remainder : 0;
            number /= 10;
        }
        return sum;
    }
}
