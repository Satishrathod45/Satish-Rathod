import java.util.Scanner;
public class ifElseNumber 
{
   public static void main(String args[])
   {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int num=sc.nextInt();


    if (num >= 10)
    {
      System.out.println("Number is greater than or equal to ten");
    }
    else
    System.out.println("Number is less than ten");
   }   
}