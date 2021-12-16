static void printlist(Node head)
{
 Node temp = head;
 // If linked list is not empty.
 if(head!=null){
 //Keep printing nodes till we reach the fisrt node again.
 do
 {
 System.out.println(temp.data + " ");
 temp=temp.next;
 }
 while(temp!=head);
 }
 }
