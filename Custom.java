import java.util.*;
class InvalidAgeExceptions extends Exception
  {
    public InvalidAgeExceptions(String msg)
    {
      super(msg);
    }
  }
class Custom
  {
    public static void validate(int age) throws InvalidAgeExceptions
    {
      if(age>18)
      {
        System.out.println("person is Eligible");
      }
      else{
        throw new InvalidAgeExceptions("person is not Eligible");
      }
    }
    public static void main(String[]args){
       System.out.println("Hello");
          System.out.println("Hello");
       System.out.println("Hello");
      String name="Anil";
      try{
        validate(15);
      }
      catch(InvalidAgeExceptions obj){
        System.out.println(obj);
      }
      finally{
        System.out.println("Finally block executed always");
      }
         System.out.println("Hello");
         System.out.println("Hello");
  
    }
  }