import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Question5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        boolean stopper = true;
        while(stopper) {
            System.out.print("Enter number[-1 to stop]: ");
            int number = in.nextInt();
            if(number == -1) {
                stopper = false;
            } else {
                numbers.add(number);
            }
        }
        int mostFrequentNumber = numbers.get(0);
        int maxFrequency = 0;
        for (int i = 0; i < numbers.size(); i++) {
            int currentNumber = numbers.get(i);
            int frequency = 0;
            for (int j = 0; j < numbers.size(); j++) {
                if (numbers.get(j) == currentNumber) {
                    frequency++;
                }
            }
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                mostFrequentNumber = currentNumber;
            }
            for (int k = i + 1; k < numbers.size(); k++) {
                if (numbers.get(k) == currentNumber) {
                    i++;
                }
            }
        }
        System.out.println("The most frequent number is " + mostFrequentNumber);
    }
}
