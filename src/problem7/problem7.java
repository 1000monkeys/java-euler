package src.problem7;


import java.util.concurrent.TimeUnit;

/*
    Made by Kjell Vos
    vos.kjell@gmail.com
*/
class problem7 {
    public static void main(String[] args){
        final long startTime = System.nanoTime();

        int i = 0;
        int primeCount = 0;
        while (primeCount < 10001){
            if (isPrime(i)){
                primeCount += 1;
            }
            i += 1;
        }

        System.out.println(i - 1);

        final long endTime = System.nanoTime();
        System.out.println("Total execution time in nano seconds: " +
                           (endTime - startTime)
        );
        System.out.println("Total execution time in milli seconds: " +
                           TimeUnit.NANOSECONDS.toMillis(endTime - startTime)
        );
    }

    public static boolean isPrime(int number){
        boolean isPrime = true;
        if (number <= 1){
            isPrime = false;
        }else if (Math.sqrt(number) % 1 == 0) {
            isPrime = false;
        }else{
            double sqrt = Math.sqrt(number);
            for (int i = 2; i <= sqrt; ++i){
                if (number % i == 0){
                    isPrime = false;
                    break;
                }
            }
        }
        return isPrime;
    }
}
