public class Arithmetic
{

      public static String arith(int n1,int n2)
      {
           int sum=n1+n2;
           int sub=n1-n2;
           int  mul=n1*n2;
            int div=n1/n2;
           int  mod=n1%n2;
        return "sum is : "+sum+" substraction is : "+sub+" multiolication is : "+mul+" division is : "+div+" modulis is : "+mod;
      }





      public static void main(String args[])
      {
         System.out.println(arith(5,6));   
      }
}