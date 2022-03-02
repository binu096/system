import java.util.Scanner;
class Palindrome
{
public static void main(String ars[])
{
Integer n,s=0,r,t;
System.out.println("Enter the number to check :");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
t=n;
while(n>0)
{
r=n%10;
s=(s*10)+r;
n=n/10;
}
if(t==s)
System.out.println("This is a palindrome");
else
System.out.println("This is a not palindrome");
}
}	
