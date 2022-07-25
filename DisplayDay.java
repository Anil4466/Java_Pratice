/*
  JFM1T4_Assignment2:
  Write a program to display the name of the day, based on the number, using the switch statement.
  Prompt the user to input a number between 1 and 7. 
  
  Sample Input: 1
  
  Expected Output: Monday
  
*/

//import statements for java program to read inputs using Scanner class 
import java.util.Scanner;

public class DisplayDay {

//declare number variable
public static void main(String []args){
//Use the scanner class to provide input at execution time using scanner object
//Scanner s= new Scanner(System.in);
Scanner s=new Scanner(System.in);

/*
Take input of the number for displaying day
System.out.println("Enter value for displaying day:");
number=sc.nextInt();
*/
System.out.println("Enter value for displaying day");
  int number=s.nextInt();
//Declare switch case and check the input value to print the day entered by the user
   switch(number)
     {
       case 1:
      System.out.println("monday");
         break;
         case 2:
      System.out.println("Tuesday");
         break;
          case 3:
      System.out.println("Wednesday");
         break;
           case 4:
      System.out.println("Thursday");
         break;
           case 5:
      System.out.println("Friday");
         break;
           case 6:
      System.out.println("Saturday");
         break;
           case 7:
      System.out.println("Sunday");
         break;    
     }
}
}