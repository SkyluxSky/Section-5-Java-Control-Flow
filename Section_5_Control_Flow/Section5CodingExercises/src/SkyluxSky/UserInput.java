package SkyluxSky;

import java.util.Scanner;

public class UserInput {

    public static void userInput(){
        Scanner scanner = new Scanner(System.in);

        //Counts valid numbers
        int counter = 0;
        //Sum of counted numbers
        int sum = 0;

//        while(true){
//            int order = counter + 1;
//            System.out.println("Enter number #" + order + ":");
//
//            //Scans for int
//            boolean isAnInt = scanner.hasNextInt();
//
//            if (isAnInt){
//                int number = scanner.nextInt();
//                counter++;
//                //adds up numbers
//                sum += number;
//
//                if(counter == 10){
//                    break;
//                }
//
//            } else {
//                System.out.println("Invalid Number");
//            }
//            scanner.nextLine(); //handle end of line enter key
//        }

        while(counter < 10){

            int order = counter + 1;
            System.out.println("Enter number #" + order + ":");

            //Scans for int
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt){
                int number = scanner.nextInt();
                counter++;
                //adds up numbers
                sum += number;


            } else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine(); //handle end of line enter key
        }


        System.out.println("Sum = " + sum);

        //Remember to close scanner - frees memory
        scanner.close();
    }


}
