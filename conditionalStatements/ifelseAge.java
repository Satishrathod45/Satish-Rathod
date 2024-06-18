import java.util.Scanner;
public class ifelseAge 
{
     

      //this function chech whether a person eligible for vote or not

      public static void vote(int n1)
      {
            if(n1>18)
            System.out.println("person eligible for vote");
            else
            System.out.println("person not eligible for vote");
      }


      public static void main(String args[])
      {
            Scanner  sc=new Scanner(System.in);
            System.out.println("enter a number");
            int n1=sc.nextInt();
            vote(n1);
            sc.close();
      }
}