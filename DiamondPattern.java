/* JFM1T4_Assignment5:
   Write a program to print the following pattern:
       a
     a b a
   a b c b a
     a b a
       a
*/

public class DiamondPattern {

//Add main method here
public static void main(String []args){
//Declare variables i,j,k,m and initialize ch=97(because we are printing alphabet a)
int i,j,k,m,ch=97;
//use for loop and if condition to print a,b,c 
    for(i=0;i<=2;i++)
      {
      for(j=2;j>i;j--)
      {
        System.out.print(" ");
      }
      for(k=0;k<=i;k++)
      {
         System.out.print((char) (ch + k));
      }
      for(m=i-1;m>=0;m--)
        {
          System.out.print((char) (ch + m)); 
        }
       System.out.println();
   }
  for(i=0;i<=1;i++)
  {
     for(j=-1;j<i;j++)
    {
        System.out.print(" ");
    }
 for(k=0;k<1-i;k++)
   {
     System.out.print((char) (ch + k));
   }
 for(m=1-i;m>=0;m--)
 {
       System.out.print((char) (ch + m));
 }
      System.out.println();  
}
}
}