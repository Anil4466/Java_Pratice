import java.util.*;
class InvalidMobileNumberException extends Exception
  {
    public InvalidMobileNumberException (String msg)
    {
      super(msg);
    }
  }
class Moblienumber
  {
    public static void validate(String Mobilenumber) throws InvalidMobileNumberException
    {
      if(Mobilenumber.length()<10)
      {
      throw new InvalidMobileNumberException("invalid mobilenumber");
    }
    else
    {
      System.out.println("mobilenumber");
    }
  }
public static void main(String[]args)
  {
  try{
    validate("12345678");
  }
  catch(InvalidMobileNumberException ex)
    {
      System.out.println(ex);
        }
    }
  }