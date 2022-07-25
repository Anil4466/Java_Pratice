/* JFM1T4_Assignment1:
   Write a program to find the highest among the given 3 numbers.
   Prompt the user for the 3 numbers to be input from the terminal.

   SampleInput: 
   Enter the first number: 11
   Enter the second number: 22
   Enter the third number: 1

   Expected Output:
   22 is highest number
 	
*/

//import statements for java program to read inputs using Scanner class 
import java.util.Scanner;

public class HighestNumber {
     
//Add main method
public static void main(String []args){
//Declare the three variables
int number1;
  int number2;
  int number3;
//Use the scanner class to provide input at execution time
/* 
 Scanner s= new Scanner(System.in);
 System.out.println("Enter the first number");
 number1=s.nextInt();
  
*/
 Scanner s= new Scanner(System.in);
System.out.println("Enter the first number:");
  number1=s.nextInt();
System.out.println("Enter the second number:");
  number2=s.nextInt();
  System.out.println("Enter the third number:");
  number3=s.nextInt();
//check which number is highest using if else condition
if(number1>=number2 && number1>=number2){
  System.out.println(number1+" is the highest number");
}
  else if(number2>=number3){
  System.out.println(number2+" is the highest number");
}
  else{
    System.out.println(number3+" is the highest number");  //Print the highest of three numbers
  }
}
}