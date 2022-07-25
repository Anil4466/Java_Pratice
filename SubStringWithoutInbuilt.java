/*  JFM1T8_Assignment3:

    Write a program to find a substring in a string without using an inbuilt method of String class.
    Prompt the user input from the terminal.
    
    Sample input: Learning made easy at bitLabs
    Enter search string: bitLabs
    
    Expected output: bitLabs is found
    
    Enter search string: bitlab
    Expected output: bitlab is not found

*/

import java.util.Scanner;

public class SubStringWithoutInbuilt {

//main method
public static void main(String[]args){
//declare variables
String s,s2;
//take input from user
Scanner sc=new Scanner(System.in);
  System.out.println("Enter String");
  s=sc.nextLine();
  System.out.print("Enter Search String: ");
  s2=sc.nextLine();
//compare two strings if the search string found or not without using inbuilt method isSubString()
if(isSubString(s,s2))
{
  System.out.println(s2 + " is found");
}
  else{
      System.out.println(s2 + " is not found");
  }
    System.out.println(isSubString(s,s2));
}
//creat isSubString method in that declare variable 
public static boolean isSubString(String s,String s2){
  boolean match=true;
//check two strings if the search string is present then return true else return false
String word[]=s.split(" ");
  for(int i=0;i<word.length;i++){
    if(word[i].equals(s2)){
      match=true;
      break;
    }
    else{
      match=false;
    }
}
  return match;
}
}