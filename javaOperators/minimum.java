public class minimum
 {
      public static void main(String[] args) 
      {
          int num1 = 80;
          int num2 = 40;
          int num3 = 30;
          int num4 = 50;
  
          
          int min1 = (num1 < num2) ? num1 : num2;
          int min2 = (num3 < num4) ? num3 : num4;
          int minimum = (min1 < min2) ? min1 : min2;
  
          
          System.out.println("The minimum number is: " + minimum);
      }
  }
  