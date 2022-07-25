/* JFM1T6_Assignment1:

   Write an Employee class with any 3 properties and create 2 employee objects to store and display the data.
   Prompt the user for the 2 employees to be input from the terminal.

   Sample Input:
   Enter the Empid: 01
   Enter the Name: Sree
   Enter Salary: 1000
   Enter the Empid: 02
   Enter the Name: Balaji
   Enter Salary: 2000

   Expected Output:
   **** Stored data displayed below ****
   Employee id = 01
   Employee name = Sree
   Employee salary = 1000
   Employee id = 02
   Employee name = Balaji
   Employee salary = 2000

*/

import java.util.Scanner;
public class Employee {

//Declare the variables
int empid;
  String name;
  int salary;
//Create a method getInput() 

public void getInput()
  {
//create Scanner object
Scanner sc=new Scanner(System.in);
//take input from user
  System.out.print("Enter the Empid: ");
  empid=sc.nextInt();
   System.out.print("Enter the Name: ");
  name=sc.next();
   System.out.print("Enter the Salary: ");
  salary=sc.nextInt();
  
}

//create display method
public void display(){
//Print Employee details
System.out.println("Employee id= " +empid);
 System.out.println("Employee name= " +name);
  System.out.println("Employee salary= " +salary);
}

//Create a Employee constructor with the two employees
public static void main(String[] args){
  Employee emp[]=new Employee[2];
  for(int i=0;i<2;i++){
    emp[i]=new Employee();
   emp[i].getInput();
  }
//check for loop to print two employee details
  System.out.println("***Stored date displayed below***");
for(int i=0;i<2;i++){
  emp[i].display();
    }
}
}