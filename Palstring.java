import java.util.Scanner;
class Palstring
{
public static void main(String args[])
{
String s,r="";
System.out.println("Enter the string to check :");
Scanner sc=new Scanner(System.in);
s=sc.nextLine();
for(int i=s.length()-1;i>=0;i--)
{
r=r+s.charAt(i);
}
if(s.equals(r))
{
System.out.println("This is a palindrome");
}
else
{
System.out.println("This is a not palindrome");
}
}
}
