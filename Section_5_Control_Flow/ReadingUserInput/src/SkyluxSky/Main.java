package SkyluxSky;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //System in reads from the console. Opposite of System Out
        //New keyword creates new instance
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth: ");

        //Checks to see if entered value is an int
        boolean hasNextInt = scanner.hasNextInt();

        if (hasNextInt){

            //nextInt parses string to int.
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine();//Handle next line character enter key.

            System.out.println("Enter your name: ");
            String name = scanner.nextLine();

            int age = 2021 - yearOfBirth;

            //Check age
            if(age >= 0 && age <= 100){
                System.out.println("Your name is " + name + " and you are " + age + " years old.");
            } else {
                System.out.println("Invalid Year of Birth");
            }

        } else {
            System.out.println("Unable to parse year of birth.");

        }

        //After using scanner close the scanner - frees memory.
        scanner.close();

    }
}
