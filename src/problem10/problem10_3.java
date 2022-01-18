package src.problem10;

import java.util.concurrent.TimeUnit;

/*
    Made by Kjell Vos
    vos.kjell@gmail.com
    Quicker sieve
*/
class problem10_3 {
    public static void main(String[] args){
        final long startTime = System.nanoTime();

        int max = 2_000_000;
        boolean[] markings = new boolean[max];
        for (int i = 2; i <= Math.sqrt(max); i++) {
            if (markings[i] == false) {
                int original = i;
                for (int j = i + i; j < max; j = j + original) {
                    markings[j] = true;
                }
            }
        }
 
        long sum = 2;
        for (int i = 3; i < max; i += 2) {
            if (markings[i] == false) {
                sum += i;
            }
        }
        System.out.println(sum);

        final long endTime = System.nanoTime();
        System.out.println("Total execution time in nano seconds: " +
                           (endTime - startTime) 
        );
        System.out.println("Total execution time in milli seconds: " +
                           TimeUnit.NANOSECONDS.toMillis(endTime - startTime)
        );
    }
}
