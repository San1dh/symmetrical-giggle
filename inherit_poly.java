abstract class Shape
{
 abstract void numberOfSides();
 
}

class Rectangle extends Shape
{
 void numberOfSides()
 {
  System.out.println("Reactangle has Four sides");
 }
} 

class Triangle extends Shape
{
 void numberOfSides()
 {
  System.out.println("Triangle has Three sides");
 }
} 

class Hexagon extends Shape
{
 void numberOfSides()
 {
  System.out.println("Hexagon has Six sides");
 }
}  

class Main 
{
 public static void main(String[] args)
 {
  System.out.println();
  Rectangle r = new Rectangle();
	r.numberOfSides();
  System.out.println();
  Triangle t = new Triangle();
  t.numberOfSides();
  System.out.println();
	Hexagon h =  new Hexagon();
  h.numberOfSides();
 }
}
