import java.util.ArrayList;

class Main{
    public static void main(String[] args) {
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
    }
}
