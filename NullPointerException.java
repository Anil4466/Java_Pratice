/*4. Write a program which will illustrate NullPointerException. Create student class along with name, marks and city and add setter methods and getter methods.
  Create a method which can take student class as a parameter and print name, marks and city in method business logic.
  Write your comments regarding NullPointerException such "When NullPointerException will occur in program?"
*/
public class NullPointerException {

    public static void main(String args[]) {
String s=null;
      //nullpointerexception will be check
      try{
        System.out.println(s);
        System.out.println(s.length());
    }
      catch(Exception ex){
        System.out.println(ex);
      }
      
      }
}

