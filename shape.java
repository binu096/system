abstract class Shape
{
public abstract void numberOfSides();
}
class Rectangle extends Shape
{
public void numberOfSides()
{
System.out.println("Rectangle has 4 sides");
}
}
class Triangle extends Shape
{
public void numberOfSides()
{
System.out.println("Triangle has 3 sides");
}
}
class Hexagon extends Shape
{
public void numberOfSides()
{
System.out.println("Hexagon has 6 sides");
}
}
class shape
{
public static void main(String args[])
{
Rectangle r=new Rectangle();
r.numberOfSides();
Triangle t=new Triangle();
t.numberOfSides();
Hexagon h=new Hexagon();
h.numberOfSides();
}
}
