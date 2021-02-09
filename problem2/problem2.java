import java.util.ArrayList;

class Main {
    public static void main(String[] args){
        ArrayList<Integer> sequence = new ArrayList<Integer>();
        sequence.add(0);
        sequence.add(1);
        sequence.add(1);
        
        for (int i = 2; sequence.get(i) < 4_000_000; i += 1) {
            sequence.add(sequence.get(i) + sequence.get(i - 1));
        }

        long sum = 0;
        for (int number : sequence) {
            if (number % 2 == 0) {
                sum += number;
            }
        }
        System.out.println(sum);
    }
}
