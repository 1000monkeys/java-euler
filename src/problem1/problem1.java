package src.problem1;

import java.util.concurrent.TimeUnit;


/*
    Made by Kjell Vos
    vos.kjell@gmail.com`
*/
class Problem1{
    public static void main(String[] args) {
        final long startTime = System.nanoTime();

        int sum = 0;
        for (int i = 3; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum + "testing 123");

        final long endTime = System.nanoTime();
        System.out.println("Total execution time in nano seconds: " +
                           (endTime - startTime)
        );
        System.out.println("Total execution time in milli seconds: " +
                           TimeUnit.NANOSECONDS.toMillis(endTime - startTime)
        );
    }
}
