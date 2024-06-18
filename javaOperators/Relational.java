public class Relational {
      public static void main(String[] args) {
          int a = 10;
          int b = 20;
  
          // Relational operators
          boolean equal = (a == b);
          boolean notEqual = (a != b);
          boolean greaterThan = (a > b);
          boolean lessThan = (a < b);
          boolean greaterThanOrEqual = (a >= b);
          boolean lessThanOrEqual = (a <= b);
  
      
          System.out.println("a == b: " + equal + 
                            ",a != b: " + notEqual +
                             ", a > b: " + greaterThan +  
                             ", a < b: " + lessThan +
                             ", a >= b: " + greaterThanOrEqual + 
                             ", a <= b: " + lessThanOrEqual);
      }
  }
  