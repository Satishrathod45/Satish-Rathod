import java.util.Scanner;
public class Assignment
{
      public static void main(String args [])
      {
            Scanner sc=new Scanner(System.in);            
            System.out.println("enter first numbers");
            int a=sc.nextInt();
            System.out.println("enter second numbers");
            int b=sc.nextInt();

            a += b;
            b -= a;
            a *= b;
          //  b /= a;
            a %= b;

            System.out.println("Assignment result : a= "+ a + " , b ="+ b);
      }
}

