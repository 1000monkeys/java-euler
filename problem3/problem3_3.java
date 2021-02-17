import java.util.concurrent.TimeUnit;

/*
    Made by Kjell Vos
    vos.kjell@gmail.com
*/
class Main {
    public static void main(String[] args){
        final long startTime = System.nanoTime();


        long number = 600851475143L;
        long tempNumber = number;
        while (tempNumber % 2 == 0) {
            System.out.println(2);
            tempNumber = tempNumber / 2;
        }

        for (long i = 3; i <= Math.sqrt(tempNumber); i += 2) {
            while (tempNumber % i == 0) {
                System.out.println(i);
                tempNumber = tempNumber / i;
            }
        }
        
        if (tempNumber > 1){
            System.out.println(tempNumber);
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
