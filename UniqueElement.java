import java.util.*;
class UniqueElement
  {
    public static void main(String[]args)
    {
     
      Scanner s=new Scanner(System.in);
      System.out.println("Enter size of array");
       int n=s.nextInt();
      int arr[]=new int[n];
        System.out.println("Enter the array element");
        for(int i=0;i<n;i++)
        {
             arr[i]=s.nextInt();
          }
      for(int i=0;i<n-1;i++)
        {
          int count=0;
          for(int j=0;j<n;j++)
            {
              if(i!=j)
              {
                if(arr[i]==arr[j])
                {
                  count++;
                }
              }
              if(count==0)
              {
                 System.out.println(arr[i]);  
              }
            }
        }
    }
  }