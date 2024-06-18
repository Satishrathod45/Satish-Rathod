public class Tarnary
 {
      public static void main(String[] args)
       {
          int a = 10;
          int b = 20;
          int c = 5;
  
          // Ternary operator
          String result1 = (a > b) ? "a is greater than b" : "a is not greater than b";
          String result2 = (a < b) ? "a is less than b" : "a is not less than b";
          String result3 = (a == b) ? "a is equal to b" : "a is not equal to b";
          String result4 = (a >= c) ? "a is greater than or equal to c" : "a is less than c";
          String result5 = (a <= c) ? "a is less than or equal to c" : "a is greater than c";
          String result6 = (a != c) ? "a is not equal to c" : "a is equal to c";
  
          
          System.out.println(result1 + ", " + result2 + ", " + result3 + ", " + result4 + ", " + result5 + ", " + result6);
      }
  }
  