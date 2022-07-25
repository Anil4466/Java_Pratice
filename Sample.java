import java.util.Scanner;
class Demo02
  {
    Scanner s=new Scanner(System.in);
    String productname;
    int id;
    String manufacture;
    long price;
    Demo02(String a,int b,String c,int d)
    {
      productname=a;
      id=b;
      manufacture=c;
      price=d;
    }
      public String toString()
        {
     return "productname: " +productname+ " id: "+id+ " manufacture: "+manufacture+ " price: "+price;
        }
    }
  
class Sample
  {
    public static void main(String[] args)
    {
      Demo02 s=new Demo02("Oppo",123,"India",10000);
      System.out.println(s);
    }
  }