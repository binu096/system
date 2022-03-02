import java.io.*;
import java.util.*;
class File1
{
static void divide() throws ArithmeticException
{
int a;
int b;
int c;
Scanner sc=new Scanner(System.in);
System.out.println("Enter first number :");
a=sc.nextInt();
System.out.println("Enter Second number :");
b=sc.nextInt();
c=a/b;
System.out.println("Result :"+c);
}
public static void main(String args[])
{
divide();
}
}
