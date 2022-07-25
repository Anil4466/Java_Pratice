/* JFM1T5_Assignment 2:

   Write a program to store your 10 different expenses done in this month and print the highest price you incurred.
   Prompt the user for the 10 numbers to be input from the terminal.
   Sample Input:
   45.90
   23.56
   123
   23
   90.00
   344
   44
   60.01
   267
   100
   
   Expected Output:

   The highest price you incurred is 344.0

*/

import java.util.Scanner;

public class GroceryItems {

//Define the main method
public static void main(String[]args){
  System.out.println("Enter size of an Array");
  Scanner s=new Scanner(System.in);
  int n=s.nextInt();
  float a[]=new float[n];
    System.out.println("Enter the Array");
//Declare and initialize variables
float max=0;
//Take the 10 different expenses price

//Check the 10 different expenses price using for loop
for(int i=0;i<n;i++)
  {
    a[i]=s.nextFloat();
  }
  for(int i=0;i<n;i++)
    {
      for(int j=i;j<n;j++)
        {
          if(a[i]<a[j])
          {
            float temp=a[i];
            a[i]=a[j];
            a[j]=temp;
          }
        }
    }
    
//Calculate the highest price in all expenses and check if the expenses is more than new item. If true then return max.

//Print the result
System.out.println("The highest price you incurred is "+a[0]);
}
}