public class withoutreturn_withpar 
{

      
      public static void printSum(int a, int b) 
      {
          int sum = a + b;
          System.out.println("The sum of " + a + " and " + b + " is " + sum);
      }
  
      public static void main(String[] args) {
          int num1 = 5;
          int num2 = 3;
          printSum(num1, num2); // This will print: The sum of 5 and 3 is 8
      }
  }
  