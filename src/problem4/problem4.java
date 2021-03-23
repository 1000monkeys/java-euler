import java.util.concurrent.TimeUnit;

/*
    Made by Kjell Vos
    vos.kjell@gmail.com
*/
class problem4 {
    public static void main(String[] args){
        final long startTime = System.nanoTime();

        int max = 999;
        long maxResult = 0;

        for(int i = max; i >= 0; i--){
            for (int j = max; j >= 0; j--){
                long possResult = i * j;
                if (possResult == reverseNumber(possResult) && possResult > maxResult){
                    maxResult = possResult;
                }
            }
        }        

        System.out.println(maxResult);        

 
        final long endTime = System.nanoTime();
        System.out.println("Total execution time in nano seconds: " +
                           (endTime - startTime)
        );
        System.out.println("Total execution time in milli seconds: " +
                           TimeUnit.NANOSECONDS.toMillis(endTime - startTime)
        );
    }

    public static long reverseNumber(long number){
        long reverse = 0;
        while(number != 0){
            reverse = reverse * 10;
            reverse = reverse + number % 10;
            number = number / 10;
        }
        return reverse;
    }
}
