import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

class Main{
    public static void main(String[] args) {
        final long startTime = System.nanoTime();

        ArrayList<Integer> multiples = new ArrayList<Integer>();
        for (int i = 0; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                multiples.add(i);
            }
        }

        int sum = 0;
        for (int number : multiples) {
            sum += number;
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
}
