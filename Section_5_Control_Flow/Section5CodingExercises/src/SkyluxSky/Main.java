package SkyluxSky;

public class Main {

    public static void main(String[] args) {

        System.out.println(NumberOfDaysInMonth.isLeapYear(2017));
        System.out.println(NumberOfDaysInMonth.isLeapYear(1600));
        System.out.println(NumberOfDaysInMonth.isLeapYear(-1600));
        System.out.println(NumberOfDaysInMonth.isLeapYear(2000));

        SumThreeAndFive.threeAndFiveSum();
        SumThreeAndFive.threeAndFiveSum(90);
        System.out.println(SumOddRange.sumOdd(100, 1000));
        NumberOfDaysInMonth.getDaysInMonth(1,20);

        //UserInput.userInput();
        MinMaxScanner.minMaxNumber();
    }
}
