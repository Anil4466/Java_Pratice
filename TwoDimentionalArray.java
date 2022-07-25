/* 
   JFM1T5_Assignment 5:
   Write a program to find and print the maximum element in a two-dimensional array with its index position.
   Prompt the user input from the terminal.
   
   Sample Input:
   Enter number of row and column: 
   2
   3
   Enter arr [ 0 ] [ 0] : 1
   Enter arr [ 0 ] [ 1] : 2
   Enter arr [ 0 ] [ 2] : 3

   Enter arr [ 1 ] [ 0] : 4
   Enter arr [ 1 ] [ 1] : 5
   Enter arr [ 1 ] [ 2] : 6
   
   Expected Output:
   Largest element in array is 6 and its index position is arr [ 1 ] [ 2 ]  

*/

import java.util.Scanner;

public class TwoDimentionalArray {

//Define the main method
    public static void main(String[]args)
  {
//Declare the variables
int i,j;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter number of rows and column:");
    
//Take number of rows and columns from user in two-dimensional array
    int row=s.nextInt();
    int col=s.nextInt();
    int array[][]=new int[row][col];
    int tempi=0,tempj=0;
    int max=array[0][0];
    for(i=0;i<row;i++)
      {
        for(j=0;j<col;j++)
          {
            System.out.print("Enter arr["+i+"]["+j+"]");
            array[i][j]=s.nextInt();
            System.out.println();
          }
      }
for(i=0;i<array.length;i++)
  {
    for(j=0;j<array[i].length;j++){
      if(array[i][j]>max){
        max=array[i][j];
        tempi=i;
        tempj=j;
      }
    }
  }
//assume first element is largest and use for loop to compare the largest element with all the reamaining elements

//Calcualte the maximum element based on index poistion

//Print result
System.out.println("Largest element in array is "+max+" its index position is arr["+tempi+"]["+tempj+"]");
  }
}