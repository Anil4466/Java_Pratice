// Armstrong number program
import java.util.*;
public class Armstrong
  {
    public static void main(String []args){
  int n,c,rem,arm=0;
      Scanner sc=new Scanner(System.in);
       System.out.println("Enter any number");
       n=sc.nextInt();
      c=n;
      while(n>0)
        {
          rem=n%10;
          arm=(rem*rem*rem)+arm;
          n=n/10;
        }
       if(c==arm)
         System.out.println("Armstrong number");
      else
       System.out.println("Not Armstrong number");  
    }
  }