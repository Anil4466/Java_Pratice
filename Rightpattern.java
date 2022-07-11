import java.util.*;
class Rightpattern
  {
    public static void main(String []args) {
      Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number");
      int n =sc.nextInt();
      int space=n-1;
      int star=1;
      for(int i=0;i<n;i++)
      {
        for(int j=0;j<space;j++)
          {
            System.out.print(" ");
          }
        for(int k=0; k<star;k++)
          {
             System.out.print("*"); 
          }
         System.out.println(" ");
        star++;
        space--;
      }      
    }
  }