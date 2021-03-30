package SkyluxSky;

import java.util.Scanner;

public class MinMaxScanner {

    public static void minMaxNumber(){
        Scanner scanner = new Scanner(System.in);

        //Integer.MAX_VALUE contain constants that stores max int value.
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        //boolean flag
        boolean first = true;

        while(true){
            System.out.println("Enter a Number:");
            //Scans for int
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt){

                int number = scanner.nextInt();

                //if first input default to user input.
                if (first){
                    first = false;
                    min = number;
                    max = number;
                }

                if (number < min){
                    min = number;
                }

                if (number > max){
                    max = number;
                }

            } else {
                System.out.println("Invalid Number");
                break;
            }

            scanner.nextLine(); //handle next line input

        }

        System.out.println("minimum_value = " + min + " maximum_value = " +max );

        scanner.close();
    }
}
