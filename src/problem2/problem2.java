package src.problem2;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;


/*
    Made by Kjell Vos
    vos.kjell@gmail.com
*/
class problem2 {
    public static void main(String[] args){
        final long startTime = System.nanoTime();

        ArrayList<Integer> sequence = new ArrayList<Integer>();
        sequence.add(1);
        sequence.add(2);
        
        for (int i = 1; sequence.get(i) < 4_000_000; i += 1) {
            sequence.add(sequence.get(i) + sequence.get(i - 1));
        }
        sequence.remove(sequence.size() - 1);

        int sum = 0;
        for (int number : sequence) {
            if (number % 2 == 0) {
                sum += number;
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
