package SkyluxSky;

public class Main {

    public static void main(String[] args) {

//        int value = 1;
//        //If statement
//        if(value == 1) {
//            System.out.println("Value was 1");
//        } else if(value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Value was not 1 or 2");
//        }

        int switchValue = 4;

        //Switch statement
        //Switch statements can be used withe Byte,Shorts,Chars, and Ints
        switch(switchValue){
            case 1:
                System.out.println("Value was 1");
                //break terminates enclosing switch statement.
                break;
            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("Value was 3, 4, or 5");
                System.out.println("Actually it was " + switchValue);
                break;

            default:
                System.out.println("Value was not 1, 2, 3, 4, or 5");
                break;
        }

        System.out.println("More Code Here");
        SwitchStatementChallenge.switchStatementChallenge1('b');
        SwitchStatementChallenge.switchStatementChallenge1("January");

        DayOfTheWeekChallenge.printDayOfTheWeek(3);

    }
}
