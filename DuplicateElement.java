import java.util.*;
class DuplicateElement
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
         for(int j=i+1;j<n;j++)
                {
                  if(arr[i]==arr[j])
                  {
  System.out.println("duplicate element is: " +arr[j]);  
                  }
                }
            }
          }
      
    }