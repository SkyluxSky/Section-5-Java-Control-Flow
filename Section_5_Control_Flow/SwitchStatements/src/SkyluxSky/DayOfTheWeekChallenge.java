package SkyluxSky;

public class DayOfTheWeekChallenge {

    public static void printDayOfTheWeek(int day){

        if(day < 1 || day > 7){
            System.out.println("Invalid Day");

        } else {
            //Switch Statement
            switch (day){
                case 1:
                    System.out.println("Today is Monday!");
                    break;
                case 2:
                    System.out.println("Today is Tuesday!");
                    break;
                case 3:
                    System.out.println("Today is Wednesday!");
                    break;
                case 4:
                    System.out.println("Today is Thursday!");
                    break;
                case 5:
                    System.out.println("Today is Friday!");
                    break;
                case 6:
                    System.out.println("Today is Saturday!");
                    break;
                default:
                    System.out.println("Today is Sunday!");
                    break;
            }

        }

    }

    public static void printDayOfTheWeekAlt(int day) {

        String[] daysOfTheWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        if (day >= 0 && day <= 6) {
            System.out.println("Today is " + daysOfTheWeek[day]);
        } else {
            System.out.println("Invalid Value");
        }
    }

}
