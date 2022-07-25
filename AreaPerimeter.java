/* JFM1T10_Assignment3:

     Create an abstract class Shape with following data member and methods- 
     Create data members for height and width.
     Add getter and setter methods for height and width.
     Create methods for finding area and perimeter.
     Create three subclasses Square, Rectangle and EquilateralTriangle that extends Shape class and define both the methods.
     Write a program that will find the area and perimeter of 3 Shapes and print the details for all. 
     Prompt the user for the  values to be input from the terminal.
 
     Sample Input:
     Enter Width of Rectangle in meters
     10
     Enter Length of Rectangle in meters
     5
     Enter width of Equilateraltriangle
     15
     Enter radius of circle
     60

     Expected Output:
     Rectangle width: 10.0 meters and length: 5.0 meters
     Resulting area: 50.0 square meters
     Resulting perimeter: 30.0 meters 

     EquiTriangle side: 15.0meters
     Resulting area: 97 square meters
     Resulting perimeter: 45.0 meters 

     Circle radius : 60.0meters
     Resulting area: 11310 square meters
     Resulting perimeter: 377 meters  

*/

import java.util.Scanner;

abstract class Shape     
{
    private double height;
    private double width;
    private double length;
    private double radius;
    void setHeight(double height)
    {
      this.height = height;
    }
    void setWidth(double width)
    {
      this.width = width;
    }
    void setLength(double length)
    {
      this.length = length;
    }
    void setRadius(double radius)
    {
      this.radius = radius;
    }
    double getHeight()
    {
      return height;
    }
    double getWidth()
    {
      return width;
    }
    double getLength()
    {
      return length;
    }
    double getRadius()
    {
      return radius;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    }
//Add Square class that extends Shape class
class Circle extends Shape
  {
    public double getArea()
    {
      return (3.14*(getRadius()*getRadius()));
    }
    public double getPerimeter()
    {
      return (2*3.14*getRadius());
    }
  }
//Add Rectangle class that extends Shape class
class Rectangle extends Shape
  {
    public double getArea()
    {
      return (getLength()*getWidth());
    }
    public double getPerimeter()
    {
      return (2*(getLength()+getWidth()));
    }
  }
//Add EquilateralTriangle class that extends Shape class
class EquilateralTriangle extends Shape
  { 
    public double getArea() 
    {
      return (1.72*getWidth()*getWidth())/4;
    }
    public double getPerimeter()
    {
      return (getWidth()+getWidth()+getWidth());
    }
}

class AreaPerimeter {

//Add the main method here and find Area and Perimeter 
  public static void main(String args[])
  {
//Use the scanner class to provide height and width at execution time

/*
Scanner s= new Scanner(System.in);
System.out.println("Enter the height of triangle");
EquilateralTriangle triangle=new EquilateralTriangle();
triangle.setHeight(s.nextInt());
*/
Scanner s= new Scanner(System.in);
    Rectangle rect = new Rectangle();
    System.out.println("Enter the width of the rectangle");
    rect.setWidth(s.nextDouble());
    System.out.println("Enter the length of the rectangle");
    rect.setLength(s.nextDouble());
    
    EquilateralTriangle triangle=new EquilateralTriangle();
    System.out.println("Enter the width of the equilateral triangle");
    triangle.setWidth(s.nextDouble());

    
    Circle circle = new Circle();
    System.out.println("Enter the radius of circle");
    circle.setRadius(s.nextDouble());
    
    System.out.println();
    System.out.println("Rectangle width: "+ rect.getWidth() +" meters and length: "+ rect.getLength() +" meters");
    System.out.println("Resulting area: "+ rect.getArea() +" square meters");
    System.out.println("Resulting perimeter: "+rect.getPerimeter() +" meters");
    System.out.println();

    System.out.println("EquiTriangle side: "+triangle.getWidth()+" meters");
    System.out.println("Resulting area: "+triangle.getArea()+" square meters");
    System.out.println("Resulting perimeter: "+triangle.getPerimeter()+" meters");
    System.out.println();

    System.out.println("Circle radius : "+circle.getRadius()+" meters");
    System.out.println("Resulting area: "+circle.getArea()+" square meters");
    System.out.println("Resulting perimeter: "+circle.getPerimeter()+" meters");
  }
}
