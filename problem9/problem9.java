import java.util.concurrent.TimeUnit;

/*
    Made by Kjell Vos
    vos.kjell@gmail.com
*/
class Main {
    public static void main(String[] args){
        final long startTime = System.nanoTime();

        // code
        for (int a = 1; a < 1000 / 3; a++) {
            for (int b = a; b < 1000 / 2; b++) {
                int c = 1000 - a - b;    
                if (a + b + c == 1000 && a*a + b*b == c*c) {
                    System.out.println("a:" + a);
                    System.out.println("b:" + b);
                    System.out.println("c:" + c);
                    System.out.println(a*a + b*b + c*c);
                }
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
