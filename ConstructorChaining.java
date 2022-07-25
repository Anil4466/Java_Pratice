/* JFM1T10_Assignment1:

   Write a program to demonstrate Constructor chaining in Java 
   Add atleast 3 constructors

   Sample Output:
   Parent class default constructor
   Child class default constructor
   Parent class one-argument constructor
   Child class one-argument constructor

*/
class Parent
  {
    Parent()
    {
      this(80,90);
      System.out.println("child class default constructor");
    }
    Parent(int x, int y)
    {
      System.out.println("parent class default constructor");
    }
  }
class Child extends Parent
  {
    Child()
    {
      this("Anil", "Kumar");
      System.out.println("parent class one-argument constructor");
    }
    Child(String str1, String str2)
    {
      super();
      {
        System.out.println("Child class one-argument constructor");
      }
    }
  }
class ConstructorChaining
  {
  public static void main(String args[])
  {
    Child c=new Child();
  }
}
  

