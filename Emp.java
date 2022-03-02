import java.util.Scanner;
class Employee
{
private int age;
private long phone_no;
private String name,address;
private Double salary;
public void get(){
Scanner sc=new Scanner(System.in);
Scanner sc1=new Scanner(System.in);
System.out.println("Enter the name :");
name=sc.nextLine();
System.out.println("Enter the age :");
age=sc.nextInt();
System.out.println("Enter the phone_no :");
phone_no=sc.nextLong();
System.out.println("Enter the address :");
address=sc1.nextLine();
System.out.println("Enter the salary :");
salary=sc.nextDouble();
}
public void print_salary(){
System.out.println("Employee salary:"+salary);
}
public void display()
{
System.out.println("Employee name :"+name);
System.out.println("Employee age :"+age);
System.out.println("Employee phone_no :"+phone_no);
System.out.println("Employee address :"+address);
System.out.println("Employee salary :"+salary);
}
}
class officer extends Employee
{
private String specialization,department;
public void officer(){
System.out.println("Enter the officer details");
get();
Scanner sc=new Scanner(System.in);
System.out.println("Enter the specialization");
specialization=sc.nextLine();
System.out.println("Enter the  department");
department=sc.nextLine();
System.out.println("Officer Details");
display();
System.out.println("Employee specialization :"+specialization);
System.out.println("Employee department :"+department);
}
}
class manager extends Employee
{
private String specialization,department;
public void manager()
{
System.out.println("Enter the manager details");
get();
Scanner sc=new Scanner(System.in);
System.out.println("Enter the specialization");
specialization=sc.nextLine();
System.out.println("Enter the  department");
department=sc.nextLine();
System.out.println("Manager Details");
display();
System.out.println("Employee specialization :"+specialization);
System.out.println("Employee department :"+department);
}
}
class Emp
{
public static void main(String args[])
{
officer o=new officer();
o.officer();
manager m=new manager();
m.manager();
}
}
