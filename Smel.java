import java.util.Scanner;
class Smel
{
public static void main(String args[])
{
int n,a[]=new int[100],i,temp;
System.out.println("Enter the number of elements :");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
System.out.println("Enter the array elements :");
for(i=0;i<n;i++)
{
Scanner sc1=new Scanner(System.in);
a[i]=sc1.nextInt();
}
for(i=0;i<n;i++)
{
if(a[i]>a[i+1])
{
temp=a[i];
a[i]=a[i+1];
a[i+1]=a[i];
}
}
System.out.println("Second smallest element : "+a[1]);
}
}
