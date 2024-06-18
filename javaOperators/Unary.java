public class Unary 
{
      public static void main(String[] args) 
      {
          int a = 10;
          int b = 20;
          
  
          // Unary operators
          int positiveA = +a;
          int negativeB = -b;
          int preIncrementA = ++a;  // Increment a before using its value
          int preDecrementB = --b;  // Decrement b before using its value
          int postIncrementA = a++; // Use a's value then increment it
          int postDecrementB = b--; // Use b's value then decrement it
      
  
          
          System.out.println("+a: " + positiveA + 
                             ", -b: " + negativeB +
                             ", ++a: " + preIncrementA + 
                             ", --b: " + preDecrementB +
                             ", a++: " + postIncrementA +  
                             ", b--: " + postDecrementB );
      }
  }
  