import java.util.Scanner;
class Mul
{
public static void main(String args [])
{
int a[][]=new int[100][100],b[][]=new int[100][100],c[][]=new int[100][100];
int i,j,m1,m2,n1,n2;
System.out.println("Enter the number of rows of first matrix :");
Scanner sc=new Scanner(System.in);
m1=sc.nextInt();
System.out.println("Enter the number of columns of first matrix :");
Scanner sc1=new Scanner(System.in);
n1=sc1.nextInt();
System.out.println("Enter the elements of first matrix :");
Scanner sc2=new Scanner(System.in);
for(i=0;i<m1;i++)
{
for(j=0;j<n1;j++)
{
a[i][j]=sc2.nextInt();
}
}
System.out.println("Enter the number of rows of second matrix :");
Scanner sc3=new Scanner(System.in);
m2=sc3.nextInt();
System.out.println("Enter the number of columns of second matrix :");
Scanner sc4=new Scanner(System.in);
n2=sc4.nextInt();
System.out.println("Enter the elements of second matrix :");
Scanner sc5=new Scanner(System.in);
for(i=0;i<m1;i++)
{
for(j=0;j<n1;j++)
{
b[i][j]=sc5.nextInt();
}
}
if(m1==m2&&n1==n2)
{
System.out.println("Result Matrix :");
for(i=0;i<m1;i++)
{
for(j=0;j<n1;j++)
{
c[i][j]=a[i][j]*b[i][j];
System.out.println(c[i][j]);
}
}
}
else
{
System.out.println("Multiplication is not possible !!!!");
}
}
}
