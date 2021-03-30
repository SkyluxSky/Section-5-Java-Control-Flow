package SkyluxSky;

public class Main {

    //While statement is useful for scenarios when you are not sure how many times you should loop, but would like to iterate until a statement is false.
    public static void main(String[] args) {

        //Basic While loop example - while count is not equal to 5.
        int count = 1;

        while (count != 6){
            System.out.println("Count value is " + count);
            count++;
        }
        System.out.println("\n");

        //Equivalent for statement
        for (int i = 1; i < 6; i++){
            System.out.println("Count value is " + i);
        }
        System.out.println("\n");

        //Equivalent for statement - Using count variable
        for (count = 1; count != 6; count++){
            System.out.println("Count value is " + count);
        }
        System.out.println("\n");

        //Alternative While loop
        count = 1;

        while (true){
            if (count == 6){
                break;
            } else {
                System.out.println("Count value is " + count);
                count++;
            }
        }
        System.out.println("\n");

        //Do While loop - Always executes once, even if while loop is false.
        count = 1;

        do {
            System.out.println("Count value is " + count);
            count++;

            //Breaks at the value of 100.
            if (count > 100){
                break;
            }

        } while(count < 6);

        System.out.println("\n");


        int number = 4;
        int finishNumber = 20;
        int totalEvenNumbers = 0;
        int sumOfEvenValues = 0;

        while(number <= finishNumber){
            //number increments
            number++;

            //tests for even value
            if (!isEvenNumber(number)){
                //continue keyword does not execute any code below it, but allows loop to repeat.
                //continues to next iteration.
                continue;
            }

            //prints even value
            System.out.println("Even number " + number);
            totalEvenNumbers++;
            sumOfEvenValues += number;

            if(totalEvenNumbers == 5){
                System.out.println("Total Even Numbers Found " + totalEvenNumbers);
                System.out.println("Sum of Even Numbers " + sumOfEvenValues);
                break;
            }
        }

        System.out.println("Sum of the digits is " + DigitSum.sumDigits(125445));
    }

    public static boolean isEvenNumber(int number){

        if ((number % 2) == 0){
            return true;
        } else{
            return false;
        }
    }

}
