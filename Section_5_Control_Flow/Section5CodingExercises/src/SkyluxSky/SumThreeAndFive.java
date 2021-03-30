package SkyluxSky;

public class SumThreeAndFive {

    public static void threeAndFiveSum(int number){

        if(number < 0 || number > 1000){
            System.out.println("Invalid Number");

        } else {

            int sum = 0;
            int count = 0;

            for(int i = number; i < 1000; number++){
                //System.out.println("Looping " + count);

                if ((number % 3 == 0) && (number % 5 == 0)){
                    sum += number;
                    count++;
                    System.out.println("Looping value is = " + number);

                    if(count == 5){
                        System.out.println("Total Sum of Three and Five = " + sum);
                        break;
                    }
                }
            }
        }
    }

    public static void threeAndFiveSum(){

            int sum = 0;
            int count = 0;

            for(int i = 1; i <= 1000; i++){
                if ((i % 3 == 0) && (i % 5 == 0)){

                    count++;
                    sum += i;
                    System.out.println("Found Value " + i);

                    if(count == 5){
                        System.out.println("Total Sum of Three and Five = " + sum);
                        break;
                    }
                }

            }
    }
}

