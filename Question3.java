import java.util.Scanner;

public class Question3
{
  public static void main(String[] args)
  {
    /**
     * Reads integer entered by the user, multiplies the integer by itself and print out the result.
     * 
     * Hint: in.nextInt() to read integer
     */
     
    Scanner in = new Scanner(System.in);
    System.out.print("");
    int number = in.nextInt();
    int product = number * number;
    System.out.println(product);
    in.close();
    /** in.close() to get rid of that weird error for Scanner in */
  }
}
