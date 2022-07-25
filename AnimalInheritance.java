/*   JFM1T10_Assignment2:

     Create a class Animal that has a method makeSound(). 
     Then create two subclasses of Animal class: Horse and Cat that extends Animal class and 
     provide their specific implementation of makeSound() method.

     Sample Output:
     The animal makes a sound
     The Horse says: wee wee
     The Cat says: meow meow

*/

//Add Animal class and Create Sound() method 
import java.util.Scanner;
class Animal
  {
    void MakeSound()
    {
      System.out.println("The animals makes a sound");
    }
  }
//Add Horse class that extends Animal class
class Horse extends Animal{
  void MakeSound()
  {
    System.out.println("wee wee");
  }
}
//Add Cat class that extends Animal class
class Cat extends Animal{
  void MakeSound()
  {
    System.out.println("meow meow");
  }
}
class  AnimalInheritance {
 
//Add main method here
public static void main(String[]args){
//Create all 3 Animal objects and add to an array 
Animal a[]=new Animal[3];
  a[0]=new Animal();
  a[1]=new Horse();
  a[2]=new Cat();
//Loop over the +91 88845 65589 and print sound it makes
for(int i=0;i<3;i++)
  {
    a[i].MakeSound();
  }
}
}