package src.problem12;
import java.util.concurrent.TimeUnit;

/*
    Made by Kjell Vos
    vos.kjell@gmail.com
*/
class problem12 {
    public static void main(String[] args) {
        final long startTime = System.nanoTime();

        int number = 0;
        int numberOfDivisors = 0;
        for (int i = 1; numberOfDivisors <= 500; i++) {
            number += i;
            numberOfDivisors = 0;
            for (int j = 1; j <= Math.sqrt(number); j++) {
                if (number % j == 0) {
                    if (j * j == number) {   //adding only one divisor when it's square
                        numberOfDivisors += 1;
                    }else{
                        System.out.println("ADDING 2");
                        numberOfDivisors += 2;
                    }
                }
            }
        }
        System.out.println(number + " is first triangle number with over 500 divisors. It has " + numberOfDivisors + " of them.");

        final long endTime = System.nanoTime();
        System.out.println("Total execution time in nano seconds: " +
                (endTime - startTime)
        );
        System.out.println("Total execution time in milli seconds: " +
                TimeUnit.NANOSECONDS.toMillis(endTime - startTime)
        );
    }
}