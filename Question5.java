import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    List<Integer> numList = new ArrayList<>();
    boolean stopper = true;
    while(stopper)
    {
      //System.out.print("Enter number[X to stop]: ");
      String number = in.next();
      if(number.toUpperCase().equals("X"))

      {
        stopper = false;
      }
      else
      {
        int num = Integer.parseInt(number);
        numList.add(num);
      }
    }
    in.close();
    int maxCount = 0;
    int mode = 0;
    
    for (int i = 0; i < numList.size(); i++) 
    {
        int count = 0;
        for (int j = 0; j < numList.size(); j++) {
            if (numList.get(j) == numList.get(i)) {
                count++;
            }
        }
        if (count > maxCount) {
            maxCount = count;
            mode = numList.get(i);
        }
    }
    
    System.out.println("The mode is: " + mode);
    
  }
}
