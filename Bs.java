class Bs{
public static void bin(int a[],int first,int last,int s){
int mid=(first+last)/2;
while(first<=last)
{
if(a[mid]<s)
{
first=mid+1;
}
else if(a[mid]==s)
{
System.out.println("Element is found at index :"+mid);
break;
}
else
{
last=mid-1;
}
mid=(first+last)/2;
}
if(first>last)
{
System.out.println("Element is not found ");
}
}
public static void main(String args[])
{
int a[]={10,20,60,40};
int s=40;
int last=a.length-1;
bin(a,0,last,s);
}
}

