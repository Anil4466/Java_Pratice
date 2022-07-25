/* JFM1T7_Assignment1:

   Write a program to initialize data members of Student class using constructor.
   Prompt the user for the  values to be input from the terminal

   Sample Input:
   Enter student name: Shree Balaji
   Enter student Roll no: 01

   Expected Output:
   Name: Shree Balaji    Roll no: 01

*/

import java.util.Scanner;

public class StudentConstructor
  {
//main method
public static void main(String[]args){
  
//initialize Student class using constructor
Scanner sc=new Scanner(System.in);
  System.out.print("Enter the Student name:");
  String a=sc.nextLine();
  System.out.print("Enter the Student rollno:");
  int b=sc.nextInt();
//Get student name and rollno from user and set it to the Student object  
Student2 s=new Student2(a);
  s.setRollNo(b);
//print result
System.out.println("Name:"+s.name+ " Roll no: "+s.getRollNo());
}
  }
//Create Student class in that declare variables name and roll number 
class Student2
  {
    int rollNo;
    String name;
//add  setter method for rollno
public void setRollNo(int rollNum)
    { 
         this.rollNo = rollNum; 
} 
//add getter method for rollno
public int getRollNo()
    { 
      return this.rollNo; 
} 

//add setters and getters for name fields also
public Student2(String a)
    {
      name=a;
    }
    public String getName()
    {
      return this.name;
    }
  }