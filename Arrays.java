import java.util.*;
class Arrays
  {
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of Elements");
      int n=sc.nextInt();
      int a[]=new int[n];
       System.out.println("Enter all the Elements");
      for(int i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
     
         System.out.println("Even number");
       for(int i=0;i<n;i++)
         {
           if(a[i]%2==0)
           {
              int b[i]=new int[a];
           }
         }
    }
    
  }