class Sequence 
{
      private int value;
  
      public Sequence(int initialValue)
       {
          this.value = initialValue;
      }
  
      
      public Sequence add(int number)
       {
          this.value += number;
          return this; 
      }
  
      
      public Sequence multiply(int number) {
          this.value *= number;
          return this; 
      }
  
      
      public Sequence subtract(int number) {
          this.value -= number;
          return this; 
      }
  
      
      public void display() {
          System.out.println("Current Value: " + value);
      }
  
      public static void main(String[] args) {
          // Creating a new Sequence object with initial value 10
          Sequence sequence = new Sequence(10);
          
          // Chaining method calls in a specific sequence
          sequence.add(5).multiply(2).subtract(3).display(); // Output: Current Value: 27
      }
  }
  