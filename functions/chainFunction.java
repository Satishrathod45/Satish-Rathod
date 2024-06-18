class Person 
{
      private String name;
      private int age;
  
      // Method to set the name
      public Person setName(String name)
       {
          this.name = name;
          return this; 
      }
  
      // Method to set the age
      public Person setAge(int age)
       {
          this.age = age;
          return this; 
      }
  
      // Method to display the details
      public void display() 
      {
          System.out.println("Name: " + name + ", Age: " + age);
      }
  
      public static void main(String[] args)
       {
          Person person = new Person();
          person.setName("Alice").setAge(25).display();
      }
  }
  