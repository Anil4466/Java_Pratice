/* JFM1T5_Assignment 4:

   Write a program to create a square matrix and print its transpose.
   Prompt the user input from the terminal.
   
  Sample Input:
  Enter number of rows: 3
  Enter number of columns: 3
  Elements  [1,1] : 2
  Elements  [1,2] : 3
  Elements  [1,3] : 4
  Elements  [2,1] : 1
  Elements  [2,2] : 2
  Elements  [2,3] : 3
  Elements  [3,1] : 4
  Elements  [3,2] : 5
  Elements  [3,3] : 6
   
  Expected Output:
    
  After Transpose Matrix  
  2       1       4
  3       2       5
  4       3       6
   
*/

import java.util.Scanner;

public class TransposeMatrix {

//Define the main method
public static void main(String[]args){
//Declare the variables
Scanner s=new Scanner(System.in);
//Take input from user to enter rows and column values
System.out.println("Enter no of rows");
  int row=s.nextInt();
  System.out.println("Enter no of col");
  int col=s.nextInt();
  int arr[][]=new int[row][col];
  for(int i=0;i<row;i++)
    {
      for(int j=0;j<col;j++)
        {
        System.out.println("Elements of ["+(i+1)+"] ["+(j+1)+"] is:");
      arr[i][j]=s.nextInt();    
        }
    }
  System.out.println("Square matrix");
  for(int i=0;i<row;i++)
    {
      for(int j=0;j<col;j++)
        {
          System.out.print(arr[i][j]+" ");
        }
      System.out.println();
    }
  for(int i=0;i<row;i++)
    {
      for(int j=0;j<col;j++)
        {
          int temp=arr[i][j];
          arr[i][j]=arr[j][i];
          arr[j][i]=temp;
        }
    }
//Convert the square matrix into transpose

//Print the transpose matrix
System.out.println("Transpose matrix");
  for(int i=0;i<row;i++)
    {
      for(int j=0;j<col;j++)
   {
//printing j and i instead of i and j
 System.out.print(arr[j][i]+" ");
}
      System.out.println();
    }
}
}