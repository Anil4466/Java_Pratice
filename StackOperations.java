/* JFM1T10_Assignment4:

     Create an interface named MyStack in package MyCollection with following methods- 
     void push(int I) 
     int pop() 
     Create two sub classes inheriting the MyStack interface.  
   1.class FixedStack that can accept a fixed numbers of integers. 
     The size of the Stack will be specified in the constructor. 
     If the number of integers exceed the size, “Stack overflow” message should be displayed. 
   2.class VariableStack that can accept numbers more than its size. 
     The size of the Stack will be specified in the constructor. 
     If the number of integers exceed the size, the stack should automatically grow to accommodate the new element. 
     Make a program that checks the implementation of both the classes. 
     Prompt the user for the  values to be input from the terminal.

     Sample Input:
     Enter a a few comma separated integers (Ex: 1,7,4)
     1,2,3,4,5

     Expected Output:
     Fixed Stack Overflows. Failed to push the integer:4
     Dynamic Stack Overflow. Increasing the stack length...Done
     Fixed Stack Overflows. Failed to push the integer:5
     Dynamic Stack Overflow. Increasing the stack length...Done
     Printing all elements of Fixed Stack
     3
     2
     1
     Printing all elements of Dynamic Stack
     5
     4
     3
     2
     1

*/

//Create a interface name MyStack
import MyCollection.*;
import java.io.*;

//Add a class FixedStack that implements StackOperations and create a methods push and pop
class FixedStack implements MyStack {
  public int n=100;
  public int k;
  public int a[];
  FixedStack(int p){
    n=p;
    a=new int[n];
    k=0;
  }
    public void push(int l){
    if(k>n-1){
      System.out.println("Fixed Stack Overflow.Failed to push the integer:"+ 1);
    } else {
      a[k]=1;
      k++;
    }
  }
  public int pop(){
    if(n>=0){
      n=n-1;
      return a[n+1];
    }
    return 0;
  }
    public void display(){
      for(int i=a.length -1;i>=0;i--){
        System.out.println(a[i]);
      }
    }
  }
//Add a class DynamicStack that implements StackOperations and create a methods push and pop
class DynamicStack implements MyStack
  {
  public int s;
  public int d=0;
  public int x[];
  DynamicStack(int h){
    s=h;
    x=new int[s];
  }
  public void push(int l){
    if(d>s-1){
      int i;
      s=s+1;
      int b[]=new int[s];
      for(i=0;i<x.length;i++)
        b[i]=x[i];
      b[i]=1;
      x=b;
      d++;
      System.out.println("Dynamic Stack Overflow. Increasing the stack length..Done:");
    } else {
      x[d]=1;
      d++;
    }
  }
  public int pop(){
    if(s>=0){
      s=s-1;
      return x[s + 1];
    }
    return 0;
  }
    public void display(){
      for(int i=x.length-1;i>=0;i--){
        System.out.println(x[i]);
      }
    }
  }
class  StackOperations {
//Add main method here
public static void main(String[]args) throws IOException {
  BufferedReader bi=new BufferedReader(new InputStreamReader(System.in));
  String g[];
  FixedStack f=new FixedStack(3);
  DynamicStack d=new DynamicStack(3);
  System.out.println("Enter a few comma separated integers");
  g=bi.readLine().split(",");
  for(int i=0;i<g.length;i++){
    f.push(Integer.parseInt(g[i]));
      d.push(Integer.parseInt(g[i]));
}
  System.out.println("Printing all elements of Fixed Stack");
  f.display();
  System.out.println("Printing all elements of Dynamic Stack");
  d.display();
}
}

