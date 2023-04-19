import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Question5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> numList = new ArrayList<>();
        //System.out.print("Enter no. of numbers: ");
        Integer reps = in.nextInt();
        for(int i = 0; i < reps; i++) {
            //System.out.print("Enter Number: ");
            Integer number = in.nextInt();
            numList.add(number);
        }

        // Find the mode of the list
        int mostFrequentNumber = numList.get(0);
        // stores the number that appears most in the list
        int maxFrequency = 0;
        for (int i = 0; i < numList.size(); i++) {
            int currentNumber = numList.get(i);
            int frequency = 0;
            for (int j = 0; j < numList.size(); j++) {
                if (numList.get(j) == currentNumber) {
                    frequency++;
                }
            }
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                mostFrequentNumber = currentNumber;
            }
        }
        System.out.println("The mode is: " + mostFrequentNumber);
    }
}