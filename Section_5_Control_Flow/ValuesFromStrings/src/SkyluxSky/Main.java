package SkyluxSky;

public class Main {

    public static void main(String[] args) {
	    String numberAsString = "2021";
        System.out.println("numberAsString = " + numberAsString);

        //Use integer class(Wrapper Class) for int datatype
        int number = Integer.parseInt(numberAsString);
        System.out.println("number = " + number);

        numberAsString += 1;
        number += 1;

        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number = " + number);

        //String to double
        String doubleAsString = "2021.5";
        System.out.println("doubleAsString = " + doubleAsString);

        double num = Double.parseDouble(doubleAsString);
        System.out.println("num = " + num);
    }
}
