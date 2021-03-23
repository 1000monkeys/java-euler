import java.util.concurrent.TimeUnit;

/*
    Made by Kjell Vos
    vos.kjell@gmail.com
*/
class problem5 {
    public static void main(String[] args){
        final long startTime = System.nanoTime();

        int step = 20;
        int[] numbersToCheck = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        for (int count = step; count < 1_000_000_000; count += step){
            boolean flag = true;
            for (int numberToCheck : numbersToCheck){
                if (count % numberToCheck != 0){
                    flag = false;
                    break;
                }
            }
            if (flag){
                System.out.println(count);
                break;
            }
        }
 
        final long endTime = System.nanoTime();
        System.out.println("Total execution time in nano seconds: " +
                           (endTime - startTime)
        );
        System.out.println("Total execution time in milli seconds: " +
                           TimeUnit.NANOSECONDS.toMillis(endTime - startTime)
        );
    }
}
