/* JFM1T6_Assignment2:
   Write a method that takes 2 numbers as arguments/parameters and returns the value of num2 to the power of num1 back to the main method.
   Prompt the user for the base and power values to be input from the terminal.

   Sample input:
   num1 = 3
   num2 = 2
    
   Expected Output:
   result = 9
   
*/
import java.util.*;
import java.lang.Math;
public class Power {

//main method
public static void main(String[]args){
//declare variables n,p,r and initialize r as one.
double n,p,r;
//create scanner class object
Scanner sc=new Scanner(System.in);
//take input from user
System.out.print("num1=");
  n=sc.nextInt();
System.out.print("num2=");
  p=sc.nextInt();
  System.out.print("r=");
  r=sc.nextInt();
  n=Math.pow(n,p);
  Power pow=new Power();
  double result=pow.Power1(n,p,r);
  System.out.println("Result:"+result);
}
  double Power1(double n,double p,double r)
  {
//check if (n>=0&&p==0) if true then it prints 1 else if check (n==0&&p>=1) if true then print zero else multiply r*n
if(n>0&&p==0)
{
  return(1);
}
    if(n==0&&p>=1)
    {
      return(0);
    }
    else{
      return(r*n);
    }
//print result
  }
}