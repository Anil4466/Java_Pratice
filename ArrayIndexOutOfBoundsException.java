/* 3. Write a program which will illustrate ArrayIndexOutOfBoundsException. 
   Create an array variable with n size, accept values from user and store values into array, finally print all values on console. 
   Please write your comments regarding ArrayIndexOutOfBoundsException such as " When ArrayIndexOutOfBoundsException occur in this program?"
*/
import java.util.*;
public class ArrayIndexOutOfBoundsException {
    public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
      int arr[]=new int[5];
      for(int i=0;i<5;i++){
        System.out.println("Enter the Elements");
        arr[i]=sc.nextInt();
    }
      System.out.println("Enter the number you want");
      // ArrayIndexoutofBoundException will be generated if we go beyond array
      try{
        int a=sc.nextInt();
        System.out.println(arr[a]);
      }
      catch(Exception ex)
        {
          System.out.println("enter a wroung number"+ex);
        }
}
}
