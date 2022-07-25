/* JFM1T7_Assignment3:

   Accept an integer number as input from the console and when the program is executed print the binary, octal and hexadecimal equivalent of the given number.
   Prompt the user for the  values to be input from the terminal
   Hint: Refer Java Documentation and look for the appropriate Wrapper class method

   Sample Input: 20
   
   Expected Output: Binary equivalent: 10100 Octal equivalent: 24 Hexadecimal equivalent: 14
   
*/
import java.util.Scanner;
public class EquivalentNumbers {

//Main method
public static void main(String[]args)
  {
//initialize Convert class constructor
 Convert obj = new Convert();
//create Scanner object
Scanner sc=new Scanner(System.in);
//take input from user
System.out.println("Enter the input value");
    obj.setNum(sc.nextInt());
//convert numbers into hexa,octal and binary
String hexa = Integer.toHexString(obj.getNum());
    System.out.println("HexaDecimal Value is:"+hexa);
    String octal=Integer.toOctalString(obj.getNum());
    System.out.println("Octal Value is:"+octal);
    String binary=Integer.toBinaryString(obj.getNum());
    //print result
     System.out.println("Binary Value is:"+binary);
}
}
//create Convert class in that declare variables
class Convert
  {
    int num;
//add getters and setters method
    void setNum(int n)
    {
      num=n;
    }
    int getNum()
    {
      return num;
    }
    }
