import java.util.*;
class Frequency
  {
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      int no,i,count,digit,temp;
      System.out.println("Enter any Number:");
      no=sc.nextInt();
      for(i=no;i>0;i--)
        {
          count=0;
          temp=no;
          while(temp>0)
            {
              digit=temp%10;
              if(digit==i)
              {
                count++;
              }
              temp=temp/10;
            }
          if(count>0)
          {
            System.out.print(i+"\t"+count);
          }
        }
    }
  }