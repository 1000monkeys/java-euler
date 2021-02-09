import java.util.concurrent.TimeUnit;

/*
    Made by Kjell Vos
    vos.kjell@gmail.com
*/
class Main {
    public static void main(String[] args){
        final long startTime = System.nanoTime();

        int squaresOfEachSum = 0;
        int totalSum = 0;
        for(int naturalNumber = 1; naturalNumber < 101; naturalNumber += 1){
            squaresOfEachSum += Math.pow(naturalNumber, 2);
            totalSum += naturalNumber;
        }
        double squareOfTotalSum = Math.pow(totalSum, 2);

        System.out.println("Square of each sum: " + squaresOfEachSum);
        System.out.printf("Square of the sum: %.0f\n", squareOfTotalSum); 
        System.out.printf("Difference: %.0f\n", (squareOfTotalSum - squaresOfEachSum));

        final long endTime = System.nanoTime();
        System.out.println("Total execution time in nano seconds: " +
                           (endTime - startTime)
        );
        System.out.println("Total execution time in milli seconds: " +
                           TimeUnit.NANOSECONDS.toMillis(endTime - startTime)
        );
    }
}
