/*  JFM1T8_Assignment5:

    Write a program to reverse a string using StringBuffer. Reverse entire sentence in string and also reverse each word in the string. 
    Prompt the user input from the terminal.
    
    Sample input: Learning made easy at bitLabs
    
    Expected output:
    reversing entire string: sbaLtib ta ysae edam gninraeL
    reversing each word at its place: gninraeL edam ysae ta sbaLtib  
*/

import java.util.Scanner;

public class ReverseString {

//main method
public static void main(String[]args){

//declare variables and take input from user
Scanner sc=new Scanner(System.in);
  
//creat stringbuffer object for string reversing
StringBuffer sb=new StringBuffer();
  System.out.println("Enter a string:");
  String str=sc.nextLine();
//reverse input string
  sb.append(str);
  sb.reverse();
//print entire string result
System.out.println("reversing entire string: "+sb);
//call reverWordInMyString method

/* 
   Use split() method of String class splits
   a string in several strings based on the
   delimiter passed as an argument to it
*/
String words[]=str.split(" ");
  String revString="";

/* 
   Use charAt() function returns the character
   at the given position in a string
*/
for(int i=0;i<words.length;i++)
  {
    String word =words[i];
    String rev="";
    for(int j=word.length()-1;j>=0;j--)
      {
        rev=rev + word.charAt(j);
      }
    revString =revString+rev+"";
  }
  String[] words1=str.split(" ");
  String reverseword="";
  for(String w:words1)
    {
      StringBuffer s=new StringBuffer(w);
      s.reverse();
    reverseword=reverseword+s.toString()+" ";
    }
//print reverse each word string result
System.out.println(" reversing each word at its place: "+reverseword);
}
}
