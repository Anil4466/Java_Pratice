/* 2. Write a program which will illustrate NumberFormatException. Create a test method, with in the test method accept two numbers 
   using next() method of scanner class. Convert into numerical values and print addition of two numbers. 
   Please write your comments regarding NumberFormatException such as "When NumberFormatException will occur in this program?"
*/
import java.util.*;
public class NumberFormatException {
void test(String a,String b){
  int x=Integer.parseInt(a);
  int y=Integer.parseInt(b);
  System.out.println(x+y);
    }
     public static void main(String args[]) {  
       NumberFormatException obj=new NumberFormatException();
try{
  obj.test("123$"," 1 ");
}
catch(Exception ex){
  System.out.println(ex);
}
}
}
