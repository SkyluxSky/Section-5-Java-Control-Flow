package SkyluxSky;

public class SwitchStatementChallenge {

    public static void switchStatementChallenge1(char switchInput){

        switch (switchInput){

            //cases with similar results should be typed in the same line.
            case 'a': case 'b': case 'c': case 'd':  case 'e':
                System.out.println("Char was found to be " + switchInput);
                break;

            default:
                System.out.println("Char was not a, b, c, d, or e");
                break;
        }

    }

    public static void switchStatementChallenge1(String switchInputMonth){

        switch (switchInputMonth.toLowerCase()){

            case "january": case "march": case "april": case "june":  case "july":
                System.out.println("String was found to be " + switchInputMonth);
                break;

            default:
                System.out.println( switchInputMonth + " was found to be not a case month");
                break;
        }

    }



}
