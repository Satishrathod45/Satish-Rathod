import java.util.Scanner;
public class ifelseifTwonum 
{
     

      //this function chech whether a person eligible for vote or not

      public static void compare(int n1,int n2)
      {
            if(n1==n2)
            System.out.println("n1 and n2 both are equals");
            else if(n1>n2)
            System.out.println("n1 is greater than n2");
            else
            System.out.println("n2 is greater than n1");
      }


      public static void main(String args[])
      {
            Scanner  sc=new Scanner(System.in);
            System.out.println("enter Two  numbers");
            int n1=sc.nextInt();
            int n2=sc.nextInt();
            compare(n1,n2);
            sc.close();
      }
}