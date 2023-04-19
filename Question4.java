import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
     
    Scanner in = new Scanner(System.in);
    System.out.print("");
    int base = in.nextInt();
    in.close();

    for(int i = 0;
        i < base;
        i++)
    {
      for(int j = base;
        j > i;
        j --)
      {
        System.out.print("*");
      }
      System.out.println();

    }
    
  }
}
