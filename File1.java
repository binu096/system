import java.io.*;
class File1
{
public static void main(String args[])
{
try
{
FileInputStream fin=new FileInputStream("text.txt");
FileOutputStream fout=new FileOutputStream("text1.txt");
int i;
while((i=fin.read())!=-1)
{
System.out.print((char)i);
fout.write(i);
}
fin.close();
fout.close();
}
catch(Exception e)
{
System.out.println("File ellalo");
}
finally
{
System.out.println("End of the program");
}
}
}
