//Write a java program to find sum of first and last digits of a number.
import java.util.*;
public class Demo
  {
public static void main(String []args) {
int n,sum=0;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter any number");
  n=sc.nextInt();
  int lastdigit=n%10;
    while(n>10){
      n=n/10;
    }
sum=lastdigit+n;
 System.out.println("sum of first and last digit of given number:"+sum);
  
}
  }
