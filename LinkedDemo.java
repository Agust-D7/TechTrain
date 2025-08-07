class Node
{
int val;
Node next;

Node(int val)
{
this.val=val;
}
Node(int val, Node next){
this.val=val;
this.next=next;
}
}
class LL{
Node head;
Node tail;
int size;
public void insert(int val){
Node node=new Node(val);
node.next= head;
head=node;

if(tail==null){
tail=head;
}
size=size+1;
}

public void display(){
Node temp=head;
while(temp!=null)
{
System.out.print(temp.val+" --> ");
temp=temp.next;
}
System.out.print("END");
}
}
class LinkedDemo
{
public static void main(String args[]){
LL list= new LL();
list.insert(6);
list.insert(3);
list.insert(4);
list.insert(8);
list.display();
}
}