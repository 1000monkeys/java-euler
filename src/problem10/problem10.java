import java.util.concurrent.TimeUnit;

/*
    Made by Kjell Vos
    vos.kjell@gmail.com
*/
class Main {
    public static void main(String[] args){
        final long startTime = System.nanoTime();
	
	long sum = 2;
	for (int i = 3; i < 2_000_000; i += 2) {
		if (isPrime(i)) {
			sum += i;
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

    public static boolean isPrime(int number) {
	int i = 2;
	while (i <= number / 2) {
		if (number % i == 0) {
			return false;
		}
		i++;
	}
	return true;
    }
}
