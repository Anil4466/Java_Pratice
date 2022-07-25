/*  JFM1T7_Assignment4:

    Write a program to declare a static variable roll_number inside student class. Create 3 student objects and print their names and roll numbers.
    Hint: Use increment operator to get different value of roll_number for 3 students.

   
    Expected Output:
    Roll no:1  Name: Shree 
    Roll no:2  Name: Balaji
    Roll no:3  Name: Ajay
*/

public class StaticVariable {

//main method
public static void main(String[]args){
//initializing Student class constructor by 3 times and passing 3 student names
Student1 s1=new Student1();
  Student1 s2=new Student1();
  Student1 s3=new Student1();
  int a=s1.rollNo;
  int [] array=new int[3];
  for(int i=0;i<3;i++)
    {
      array[i]=a++;
    }
  s1.setName("Shree");
   s2.setName("Balaji");
   s3.setName("Ajay");
//displaying student name and roll number
 System.out.println("Roll no: "+array[0]+ "Name: "+s1.getName());
 System.out.println("Roll no: "+array[1]+ "Name: "+s2.getName());
   System.out.println("Roll no: "+array[2]+ "Name: "+s3.getName());
}

}
//declare Student class andd add declare name, rollno(static)
class Student1
  {
    static int rollNo=1;
    String name;
//add getters and setterss
public String getName()
    {
      return name;
    }
    public void setName(String name)
    {
      this.name=name;
    }
    }