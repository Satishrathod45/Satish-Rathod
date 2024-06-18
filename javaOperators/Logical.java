public class Logical
 {
      public static void main(String[] args) 
      {
          boolean x = true;
          boolean y = false;
  
          // Logical operators
          boolean andResult = x && y;
          boolean orResult = x || y;
          boolean notX = !x;
          boolean notY = !y;
  
          
          System.out.println("x && y: " + andResult +
                             ", x || y: " + orResult +
                             ", !x: " + notX + 
                             ", !y: " + notY);
      }
  }
  