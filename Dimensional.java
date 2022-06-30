import java.util.*;
class Dimensional
  {
    public static void main(String[]args)
    {
      int row,col;
      Scanner sc=new Scanner(System.in);
        System.out.println("Enter Row size");
      row=sc.nextInt();
       System.out.println("Enter Col size");
      col=sc.nextInt();
      int[][] arr=new int[row][col];
      for(int i=0;i<row;i++)
        {
          for(int j=0;j<col;j++){
          arr[i][j]=sc.nextInt();
        }
    }
      System.out.println("****2Dimension");
      for(int i=0;i<row;i++)
        {
          for(int j=0;j<col;j++)
            {
              System.out.print(arr[i][j]+" ");
            }
           System.out.println();
        }
    }
  }