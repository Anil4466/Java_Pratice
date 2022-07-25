/* 1. Write a program to accept two numbers, one Arithmetic operator such as +, -, / , *  and print output of Arithmetic operation. 
   Write switch case to perform each operation. Handle ArithmeticException when you are performing division operation. 
*/
import java.util.*;
public class ArithmeticException {

    public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
      System.out.println("Enter any two number:");
      int a=sc.nextInt();
      int b=sc.nextInt();
      System.out.println("Enter one option to make calvulation");
      System.out.println("option 1 : To make sum");
      System.out.println("option 2 : To make subtraction");
      System.out.println("option 3 : To make division");
      System.out.println("option 4 : To make multiplication");
      int c=sc.nextInt();
      float cal=0;
      switch(c){
        case 1:
          cal=a+b;
          System.out.println("sum of two number:"+cal);
          break;
        case 2:
          cal=a-b;
          System.out.println("subtraction of two number:"+cal);
          break;
        case 3:
          try{
          cal=a/b;
          }
          catch(Exception ex){
          System.out.println(ex);
          break;
          }
        case 4:
          cal=a*b;
          System.out.println("multiplication of two number:"+cal);
          break;
        default:
          System.out.println("wroung option");
      
    }
}
}