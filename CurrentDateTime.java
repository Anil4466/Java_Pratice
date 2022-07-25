/* JFM1T6_Assignment4:

   Write a program to display current date-time. Hint: java.util package contains Date class.
   
   Sample Output:
   Date in Indian Timezone (IST) : 18-02-21 10:20:195 IST

*/

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class CurrentDateTime {

//main method
public static void main(String[]args){
/* 
capture today's date by
Date today = new Date();
*/

//create DateFormat and set TimeZone 
SimpleDateFormat sd=new SimpleDateFormat("DD-MM-YY HH:mm:ss z");
  Date today=new Date();
  System.out.print("Date in Indian time zone(IST):");
//display this date on IST time zone 
  sd.setTimeZone(TimeZone.getTimeZone("IST"));
  System.out.println(sd.format(today));
}
}