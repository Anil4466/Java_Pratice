/* JFM1T9_Assignment4:
     Extend and enhance the previous inheritance program where collegeName, designation and 
     work() method are common to all the teachers and declared in the base class in the way
     that all child classes like MathTeacher, EnglishTeacher and MusicTeacher do not need to 
     write this code and can use directly from base class. 

     Sample Output:
     Math Teacher         IIT
     English Teacher      IIT
     Music Teacher        IIT
*/
class Teacher
  {
    String collegeName;
    String designation;
    void work()
    {
      System.out.println("Working");
    }
  }
//Add Teacher class

//Add MathTeacher class
class MathTeacher extends Teacher
  {
    
  }
//Add EnglishTeacher class
class EnglishTeacher extends Teacher
  {
    
  }
//Add MusicTeacher class
class MusicTeacher extends Teacher
  {
    
  }

class CollegePrincipal {

//Add the main method here and create all different types of Teacher objects and print there college name designation.
public static void main(String[]args)
  {
MathTeacher M=new MathTeacher();
    M.collegeName="IIT";
    M.designation="MathsTeacher";
    System.out.println(M.designation+" "+M.collegeName);
EnglishTeacher E=new EnglishTeacher();
    E.collegeName="IIT";
    E.designation="EnglishTeacher";
    System.out.println(E.designation+" "+E.collegeName);
MusicTeacher M1=new MusicTeacher();
    M1.collegeName="IIT";
    M1.designation="MusicTeacher";
    System.out.println(M1.designation+" "+M1.collegeName);    
  }
}