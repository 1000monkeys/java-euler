import java.util.concurrent.TimeUnit;
import java.util.ArrayList;

/*
    Made by Kjell Vos
    vos.kjell@gmail.com
*/
class Main {
    public static void main(String[] args){
        final long startTime = System.nanoTime();

        int i = 0;
        ArrayList<Integer> primes = new ArrayList<Integer>();
        while (primes.size() < 10001){
            if (isPrime(i)){
                primes.add(i);
            }
            i += 1;
        }

        System.out.println(primes.get(10000));
 
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
