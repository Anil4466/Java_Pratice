/*  JFM1T2_Assignment1:

     Write a program to perform the below actions and print the result.
     1. Difference of 2 numbers (30 and 10)
     2. Product of 2 numbers (45 and 2)
     3. Division of 2 numbers (600 and 10)
     4. Increment and Decrement the number (15)
     5. Remainder of 2 numbers (14 and 5)
     Prompt the user input from the terminal.
*/

//import statements for java program to read inputs using Scanner class
import java.util.Scanner;

public class Operations
{
//main method
public static void main(String []args){
/*
  Use the scanner class to provide input at execution time using scanner object
  Scanner sc=new Scanner(System.in);
*/
Scanner sc=new Scanner(System.in);
/*
  Take input from user
  System.out.println("Enter first number: ");
  int a=sc.nextInt();
*/
System.out.println("Enter first number");
  int a=sc.nextInt();
System.out.println("Enter second number");
  int b=sc.nextInt();
  
//calculate difference,product,division,increment and remainder 
int diff=a-b;
 System.out.println("Difference of two numbers"+diff);
  System.out.println("Enter first number");
  int c=sc.nextInt();
System.out.println("Enter second number");
  int d=sc.nextInt();
  int product=c*d;
  System.out.println("product of 2 numbers"+product);
 System.out.println("Difference of two numbers"+diff);
  System.out.println("Enter first number");
  int e=sc.nextInt();
System.out.println("Enter second number");
  int f=sc.nextInt();
  int division=e/f;
  System.out.println("product of 2 numbers"+division);
   System.out.println("Enter first number");
 int x=sc.nextInt();
  int incre=x++;
  int decre=x--;
  System.out.println("increment of the number is:"+incre+"and decrement of the number is:"+decre);
   System.out.println("Difference of two numbers"+diff);
  System.out.println("Enter first number");
  int y=sc.nextInt();
System.out.println("Enter second number");
  int z=sc.nextInt();
int rem=y%z;
   System.out.println("product of 2 numbers"+rem);
//print appropriate result for all operations
}
}