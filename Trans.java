import java.util.Scanner;
class Trans
{
public static void main(String args [])
{
int a[][]=new int[100][100];
int i,j,m1,n1,n2;
System.out.println("Enter the number of rows of matrix :");
Scanner sc=new Scanner(System.in);
m1=sc.nextInt();
System.out.println("Enter the number of columns of matrix :");
Scanner sc1=new Scanner(System.in);
n1=sc1.nextInt();
System.out.println("Enter the elements of matrix :");
Scanner sc2=new Scanner(System.in);
for(i=0;i<m1;i++)
{
for(j=0;j<n1;j++)
{
a[i][j]=sc2.nextInt();
}
}
System.out.println("The transpose is :");
for(i=0;i<m1;i++)
{
for(j=0;j<n1;j++)
{
System.out.println(a[j][i]);
}
}
}
}
