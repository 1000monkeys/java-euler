package src.problem14;

import java.util.concurrent.TimeUnit;

/*
    Made by Kjell Vos
    vos.kjell@gmail.com
*/
class problem14 {
    public static void main(String[] args){
        final long startTime = System.nanoTime();



        final long endTime = System.nanoTime();
        System.out.println("Total execution time in nano seconds: " +
                (endTime - startTime)
        );
        System.out.println("Total execution time in milli seconds: " +
                TimeUnit.NANOSECONDS.toMillis(endTime - startTime)
        );
    }
}
