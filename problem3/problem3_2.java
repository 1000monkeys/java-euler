import java.util.concurrent.TimeUnit;

/*
    Made by Kjell Vos
    vos.kjell@gmail.com
*/
class Main {
    public static void main(String[] args){
        final long startTime = System.nanoTime();

        long numm = 600851475143L;
        long newnumm = numm;
        long largestFact = 0;

        int counter = 2;
        while(counter * counter <= newnumm){
            if (newnumm % counter == 0) {
               newnumm = newnumm / counter;
               largestFact = counter;
            }else{
                counter = (counter == 2) ? 3 : counter + 2;
            }
        }
        if (newnumm > largestFact){
            largestFact = newnumm;
        }
        System.out.println(largestFact);

        final long endTime = System.nanoTime();
        System.out.println("Total execution time in nano seconds: " +
                           (endTime - startTime)
        );
        System.out.println("Total execution time in milli seconds: " +
                           TimeUnit.NANOSECONDS.toMillis(endTime - startTime)
        );
    }
}
