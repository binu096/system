import java.util.Scanner;
class Pro
{
public static void main(String args[])
{
int n;
System.out.println("Enter the number :");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
if(n%2==1)
System.out.println("Prime number");
else if(n==0||n%2==0)		
System.out.println("Not a prime");
}
}
