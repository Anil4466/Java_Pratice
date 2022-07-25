/* JFM1T6_Assignment3:

   Write a method that takes any numbers as arguments/parameters and return the mean value back to main method.
   Prompt the user for the  values to be input from the terminal.

   Sample input:
   num1 = 3
   num2 = 2
   num3 = 4

   Expected Output:
   result = 3
   
*/

import java.util.Scanner;
public class Mean
  {
//main method
public static void main(String[]args)
    {
//declare variables and initialize sum=0
int sum=0;
int num;
//create scanner object
Scanner sc=new Scanner(System.in);
  
//take input from user

//check the for loop for number of values entered in input
for(int i=1;i<=3;i++)
  {
    System.out.print("num"+i+":");
    num=sc.nextInt();
    sum=sum+num;
  }
//calculate mean
int mean=sum/3;
  System.out.println("Result:"+mean);
//print result

}
}