package SkyluxSky;

public class Main {

    //For statement allows us to execute code n amount of times.
    //for(init; termination; increment)
    public static void main(String[] args) {

        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0,2.0));

        //Executes content n times based on i:
        for (int i = 0; i < 6; i++){
            System.out.println("Loop " + i + " Hello!\n");
        }

        System.out.println("\n********************");
        //OR
        for (int number = 1; number < 7; number += 2){
            System.out.println("Number = " +  number);
        }

        System.out.println("\n********************");

        //Challenge #1
        //Using the for statement, call the calculateInterest method with the
        //amount of 10000 with an interest rate of 2,3,4,5,6,7 and 8
        //and print results to console window.

        for (int interestRate = 2; interestRate < 9; interestRate++){
            System.out.println("10,000 at " + interestRate + "% interest = " + String.format("%.2f",calculateInterest(10000, interestRate)));
        }

        System.out.println("\n********************");

        //String.format("%.2f",calculateInterest(10000, interestRate)));
        //Convert the output to string, with only 2f, or two decimal points.
        //Gives programmer the ability to format numbers.

        //Challenge #2
        //How would you modify the for loop above to do the same thing as
        //shown but to star from 8% and work back to 2%

        for (int interestRate = 8; interestRate >= 2; interestRate--){
            System.out.println("10,000 at " + interestRate + "% interest = " + String.format("%.2f",calculateInterest(10000, interestRate)));
        }

        System.out.println("\n********************");
        //Challenge #3:
        //Count total Prime Numbers

        int count = 0;

        for (int i = 10; i < 50; i++){
            if (isPrime(i)){
                count++;
                System.out.println("Number " + i + " is a prime number!");

                //Break out of for loop once three prime numbers are found.
                if (count == 10){
                    System.out.println("Exiting For Loop!");
                    break;
                }

            }
        }

    }


    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate / 100));
    }

    //Checks for prime number
    public static boolean isPrime(int n) {

        if(n == 1) {
            return false;
        }

        //Math.sqrt takes square root of n
        for(int i=2; i <= (long)Math.sqrt(n); i++) {
            System.out.println("Looping " + i);
            if(n % i == 0) {
                return false;
            }
        }

        return true;

    }

}
