class Freq
{
public static void main(String args [])
{
String s="Helloworld";
int i,j;
int freq[]=new int[s.length()];
char c[]=s.toCharArray();
for(i=0;i<s.length();i++)
{
freq[i]=1;
for(j=i+1;j<s.length();j++)
{
if(c[i]==c[j])
{
freq[i]++;
c[j]='0';
}
}
}
System.out.println("The frequency's are :");
for(i=0;i<freq.length;i++)
{
if(c[i]!=' '&&c[i]!='0')
{
System.out.println(c[i]+"-"+freq[i]);
}
}
}
}
