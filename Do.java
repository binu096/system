public class Do
{
class Node{
int data;
Node previous;
Node next;

public Node(int data)
{
this.data=data;
}
}
Node head,tail=null;
public void addNode(int data)
{
Node newNode=new Node(data);
if(head==null)
{
head=tail=newNode;
head.previous=null;
tail.next=null;
}
else
{
tail.next=newNode;
newNode.previous=tail;
tail=newNode;
tail.next=null;	
}
}
public void deleteNode()
{
if(head==null)
{
}
else
{
if(head!=tail)
{
head=head.next;
head.previous=null;
}
}
}
public void display()
{
Node current=head;
if(head==null)
{
System.out.println("List is empty");
}
System.out.println("List elements are :");
while(current!=null){
System.out.println(current.data+"");
current=current.next;
}
}
public static void main(String args[])
{
Do d=new Do();
d.addNode(1);
d.addNode(2);
d.addNode(3);
d.addNode(4);
d.deleteNode();
d.display();
}
} 
