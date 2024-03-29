package src.problem10;

import java.util.concurrent.TimeUnit;

/**
 * This class Generates prime numbers upto a given limit using the
 * Sieve of Eratosthenes algorithm. In this algorithm, we create 
 * an array of integers starting from 2, then find the first uncrossed
 * integer, and cross out all its multiple. The process is repeated
 * until there are no more multiples in the array. 
 */
public class problem10_2 {

    public static void main(String[] args) {
        final long startTime = System.nanoTime();
        
        int[] primes = generatePrimeNumbersUpto(2_000_001);
        long sum = 0;
        for (int i = 0; i < primes.length; i++) {
            sum += primes[i];
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

    private enum Marker{
        CROSSED, UNCROSSED;
    }
    private static Marker[] crossedOut;
    private static int[] primes;
    
    public static int[] generatePrimeNumbersUpto(int limit){
        if(limit < 2){
            return new int[0];
            
        }else{
            uncrossIntegerUpto(limit);
            crossOutMultiples();
            putUncrossedIntegersIntoPrimes();
            return primes;
        }
    }
    
    private static void uncrossIntegerUpto(int limit) {
       crossedOut = new Marker[limit + 1];
       for(int i = 2; i<crossedOut.length; i++){
           crossedOut[i] = Marker.UNCROSSED;
       }
        
    }
    
    private static void crossOutMultiples() {
        int iterationLimit = determineIterationLimit();
        for (int i = 2; i<= iterationLimit; i++){
            if(notCrossed(i)){
               crossOutMultipleOf(i);
            }
        }
        
    }
    
    private static int determineIterationLimit() {
        // Every multiple in the array has a prime factor
        // that is less than or equal to the square root of
        // the array size, so we don't have to cross out
        // multiples of numbers larger than that root.
       double iterationLimit = Math.sqrt(crossedOut.length);
       return (int) iterationLimit;
    }
    
    private static boolean notCrossed(int i) {
        return crossedOut[i] == Marker.UNCROSSED;
    }
    

    private static void crossOutMultipleOf(int i) {
        for(int multiple = 2*i;
                multiple < crossedOut.length;
                multiple += i){
            crossedOut[multiple] = Marker.CROSSED;
        }
        
    }
    

    private static void putUncrossedIntegersIntoPrimes() {
        primes = new int[numberOfUncrossedIntegers()];
        for(int j = 0, i = 2; i<crossedOut.length; i++){
            if(notCrossed(i)){
                primes[j++] = i;
            }
        }
        
    }

    private static int numberOfUncrossedIntegers() {
        int count = 0;
        for(int i = 2; i<crossedOut.length; i++){
            if(notCrossed(i)){
                count++;
            }
        }        
        return count;
    }
}