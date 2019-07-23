public class PrimeNumber
{
  public static void main(String args[])
  {
    int number = Integer.parseInt(args[0]);
    if(number%2 == 1)
    {
      System.out.println(args[0] + " is a Prime Number.");
    }
    else
    {
      System.out.println(args[0] + " is not a Prime Number.");
    }
  }
}
