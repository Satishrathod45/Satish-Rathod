public class maximum
 {
      public static void main(String[] args) 
      {
          int num1 = 80;
          int num2 = 40;
          int num3 = 30;
          int num4 = 50;
  
          
          int max1 = (num1 > num2) ? num1 : num2;
          int max2 = (num3 > num4) ? num3 : num4;
          int maximum = (max1 > max2) ? max1 : max2;
  
          
          System.out.println("The maximum number is: " + maximum);
      }
  }
  