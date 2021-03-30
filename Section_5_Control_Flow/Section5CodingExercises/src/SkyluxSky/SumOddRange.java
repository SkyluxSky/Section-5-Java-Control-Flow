package SkyluxSky;

public class SumOddRange {

    public static boolean isOdd(int number){

        if(number < 0){
            return false;
        } else {
            //check if numbers odd
            return number % 2 != 0;
        }
    }

    public static int sumOdd(int start, int end){

        int sum = 0;

        //Weed out invalid values
        if ((end < start) || (start < 0) || (end < 0)){
            return -1;
            
        } else {

            for(int i = start; i <= end; i++){
                if (isOdd(i)){
                    sum += i;
                }
            }
            return sum;
        }
    }

}
