import java.util.*;
class Demo
  {
    public static void main(String[]args)
    {
     
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter size of array");
       int n=sc.nextInt();
      int a[]=new int[n];
      System.out.println("Enter the array element");
        for(int i=0;i<n;i++)
        {
             a[i]=sc.nextInt();
        }
       System.out.println("First Array elements are");
         for(int i=0;i<n;i++)
         {
            System.out.println(a[i]);
         }
        System.out.println("second Array elements are");
      int b[]=new int[n];
      for(int i=0;i<n;i++)
        {
           b[i]=a[i];
             System.out.println(b[i]);
        }
    }
  }