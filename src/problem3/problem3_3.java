import java.util.concurrent.TimeUnit;

/*
    Made by Kjell Vos
    vos.kjell@gmail.com
*/
class problem3_3 {
    public static void main(String[] args){
        final long startTime = System.nanoTime();


        long number = 600851475143L;
        while (number % 2 == 0) { //Find how many 2 factors there are
            System.out.println(2);
            number = number / 2;
        }

        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            // all primes are odd(except 2) so we increment by 2 after staring at an odd number
            while (number % i == 0) {
                //if we can divide this number without remainder it's a factor
                System.out.println(i);
                number = number / i; // divide the number by i to get the new factor
            }
        }

        if (number > 1){ // One prime factor left! print it.
            System.out.println(number);
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
