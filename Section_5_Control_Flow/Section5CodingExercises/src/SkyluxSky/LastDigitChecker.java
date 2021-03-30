package SkyluxSky;

public class LastDigitChecker {

    //checks if value is within range 9 to 1001
    public static boolean isValid(int num){
        return (num > 9) && (num < 1001);
    }

    //checks last value in number if valid
    public static boolean hasSameLastDigit(int a, int b, int c){
        if(isValid(a) && isValid(b) && isValid(c)){
            a %= 10;
            b %= 10;
            c %= 10;
            return (a == b) || (a == c) || (b == c);
        }
        return false;
    }
}
