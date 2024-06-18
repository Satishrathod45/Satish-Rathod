import java.util.Scanner;
public class Simpleif 
{
      //This function check whether a number is greater than or equal to 10
      public static void Number(int n1)
      {
            if (n1 >= 10)
            {
                  System.out.println("Number is greater than ");
            }
      }

      //this function chech whether a person eligible for vote or not

      public static void vote(int n1)
      {
            if(n1>18)
            System.out.println("person eligible for vote");
            
      }


      public static void main(String args[])
      {
            Scanner  sc=new Scanner(System.in);
            System.out.println("enter a number");
            int n1=sc.nextInt();
            Number(n1);
            vote(n1);
            sc.close();
      }
}