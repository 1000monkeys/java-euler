package src.problem6;

import java.util.concurrent.TimeUnit;

/*
    Made by Kjell Vos
    vos.kjell@gmail.com
*/
class problem6 {
    public static void main(String[] args){
        final long startTime = System.nanoTime();

        int squaresOfEachSum = 0;
        int totalSum = 0;
        for(int naturalNumber = 1; naturalNumber < 101; naturalNumber += 1){
            squaresOfEachSum += Math.pow(naturalNumber, 2);
            totalSum += naturalNumber;
        }
        int squareOfTotalSum = Math.pow(totalSum, 2);

        System.out.println("Square of each sum: " + squaresOfEachSum);
        System.out.println("Square of total sum: " + squareOfTotalSum); 
        System.out.println("Difference:" + (squareOfTotalSum - squaresOfEachSum));

        final long endTime = System.nanoTime();
        System.out.println("Total execution time in nano seconds: " +
                           (endTime - startTime)
        );
        System.out.println("Total execution time in milli seconds: " +
                           TimeUnit.NANOSECONDS.toMillis(endTime - startTime)
        );
    }
}
