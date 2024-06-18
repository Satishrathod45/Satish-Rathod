public class Recursion
 {

      // Recursive function to calculate factorial of a number
      public static int factorial(int n) {
          if (n == 0) 
          {                                    // Base case: 0! = 1
              return 1;
          } 
          else 
          {                                    // Recursive case
              return n * factorial(n - 1);
          }
      }
  
      public static void main(String[] args) {
          int number = 5;
          int result = factorial(number);
          System.out.println("Factorial of " + number + " is  : " + result);
      }
  }
  