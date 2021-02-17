import java.util.concurrent.TimeUnit;

/*
    Made by Kjell Vos
    vos.kjell@gmail.com
*/
class Main {
    static long highest = 1;

	public static void main(String[] args){
        final long startTime = System.nanoTime();

        System.out.println(find(600851475143L));

        final long endTime = System.nanoTime();
        System.out.println("Total execution time in nano seconds:  " + (endTime - startTime));
        System.out.println("Total execution time in milli seconds: " +
                           TimeUnit.NANOSECONDS.toMillis(endTime - startTime));
	}

    /**
     * Factorizes the number
     * If the factor is not a factor of number it returns number
     * @return the number either unfactorized or the remainer after factorization
     */
    private static long factorize(long number, long factor){
        if (number < factor){
            return number;
        }
        while(number % factor == 0){
            number /= factor;
            if(factor > highest){ // Save highest prime factor
                highest = factor;
            }
        }
        return number;
    }

    /**
     * Find the highest factor of the input numner
     * @return Highest factor
     */
    public static long find(long number){
        // Try the 2 most common factors
        number = factorize(number, 2);
        number = factorize(number, 3);

        if (number >= 5){
            for(long i = 5; i * i <= number; i+= 6){
                number = factorize(number, i);
                number = factorize(number, i + 2);
            }
        }
        
        return (number == 1) ? highest : number;
    }
}
