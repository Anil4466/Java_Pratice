/* JFM1T5_Assignment3:

   Write a program to store the temperature of your city for last 7 days and print the lowest temperature of the week.
   Prompt the user input from the terminal.
   
   Sample Input:
   Enter number of days 
   3
   Enter the temperature of Day :1
   88
   Enter the temperature of Day :2
   34
   Enter the temperature of Day :3
   0 
   
   Expected Output:
   The lowest temperature of the week 3 is 0.0 celsius

*/


import java.util.Scanner;

public class Temperature{

//Define the main method
public static void main(String[]args)
  {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter no of days");
//Declare the variables and initialize
int n=s.nextInt();
    float arr[]=new float[n];
    float min;
//Take temperature of 7 days as a input from user
for(int i=0;i<n;i++)
  {
    System.out.println("Enter the temperature of Day:"+(i+1));
    arr[i]=s.nextFloat();
  }
    min=arr[0];
//Calculate the lowest 
    
    int index=0;
for(int i=0;i<n;i++)
  {
   if(arr[i]<min){
     min=arr[i];
       index=i+1;
   }
  }
//Print the result
System.out.println("The lowest temperature of the Week " +index+" is "+min+ " celsius ");
}
}