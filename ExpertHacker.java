/*JFM1T9_Assignment2:
    Write a BankAccount class with members account_number and account_balance  and prevent other class objects 
    (assuming them as hackers who can steal your confidential information) to access BankAccount details.
    Steps to Follow:
    Step1: Create account_number and account_balance as member variables for BankAccount class
    Step 2: Add setter and getter methods for the above member variables 
    Prompt the user for the  values to be input from the terminal.

    Sample Input:
    Enter BankAccount Number : 6789023
    Enter Current Balance    : 67,000.89

    Expected Output:
    BankAccount Number : 6789023
    Current Balance    : 67000.89
    
*/
import java.util.Scanner;
class BankAccount { 
//declare account_number , account_balance
private float account_balance;
  private int account_number;
//create getters and setters
  public void setaccount_number(int newvalue)
  {
    account_number=newvalue;
}  
  public void setaccount_balance(float newvalue)
  {
     account_balance=newvalue;
  }
  public int getaccount_number()
  {
    return account_number;
  }
 public float getaccount_balance()
  {
    return account_balance;
  }
}
class ExpertHacker { 

public static void main(String args[]) { 

//main method

//create Scanner object
Scanner s=new Scanner(System.in);
//Take input from user
System.out.println("Enter Bank Account Number:");
  int account_number=s.nextInt();
System.out.println("Enter Current Balance:");
  float account_balance=s.nextFloat();
//Create an object of BankAccount class and set account_number and the account_balance
BankAccount bank=new BankAccount();
  bank.setaccount_number(account_number);
  bank.setaccount_balance(account_balance);
// Try accessing fields of BankAcccount class and check whether it's accessible 

// or not. If not then try accessing it with it’s setter and getter methods. 
// Print account_number and account_balance 
  System.out.println("BankAccount Number:" +account_number);
 System.out.println("Current Balance :" +account_balance);
}   
} 