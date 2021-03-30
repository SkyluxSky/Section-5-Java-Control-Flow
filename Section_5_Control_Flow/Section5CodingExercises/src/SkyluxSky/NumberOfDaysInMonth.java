package SkyluxSky;

public class NumberOfDaysInMonth {

    public static boolean isLeapYear(int year){

        if(year < 1 || year > 9999){
            return false;

        } else {

            //Calculate a Leap Year - Again!
            if((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)){
                return true;
            } else {
                return false;
            }

        }
    }

    public static int getDaysInMonth(int month, int year){
        if ((month < 1 || month > 12)||(year < 1 || year > 9999)){
            return -1;
        } else {
            switch (month){

                case 4: case 6: case 9: case 11:
                    return 30;

                case 2:
                    if(isLeapYear(year)) {
                        return 29;
                    } else {
                        return 28;
                    }

                default:
                    return 31;

            }
        }
    }
}
