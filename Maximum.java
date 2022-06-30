import java.util.*;
class Maximum
  {
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size");
        int n=sc.nextInt();
      int a[]=new int[n];
       System.out.println("Enter the array element");
      for(int i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
      int max=a[0];
        System.out.println("Maximum element are");
      for(int i=0;i<n;i++)
        {
          if(a[i]>max)
            max=a[i];
              }
           System.out.println(max);
    }
  }