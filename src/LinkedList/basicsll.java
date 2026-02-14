package LinkedList;
class Node{//Userdefined class
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
class LinkedList{//User defined DataStructure
    Node head;
    Node tail;
    int size=0;
   public void insertAtHead(int val){
       Node temp = new Node(val);
       if(head==null && tail==null){
           head= tail = temp;
       }
       else{
           temp.next = head;
           head = temp;
       }
       size++;

   }
   public void insertAtEnd(int val){
       Node temp = new Node(val);
       if(head==null && tail==null){
           head= tail = temp;
       }
       else{
           tail.next = temp;
           tail = temp;
       }
       size++;
   }
   public void insert(int i,int val){
       Node temp = new Node(val);
       if(i==0){
           insertAtHead(val);
           return;
       }
       if(i==size-1) {
           insertAtEnd(val);
           return;
       }
       else{
           Node x = head;
           for(int j=1;j<=i-1;j++){
               x = x.next;
           }
           temp.next = x.next;
           x.next = temp;
           size++;
       }

   }
   public int size(){
       return size;
   }
   public void display(){
       Node temp = head;
       while(temp!=null){
           System.out.print(temp.val+" ");
           temp = temp.next;
       }
   }
   public void delete(int idx){
       if(head==null) System.out.println("Linked List is Empty");
       else{
           Node temp = head;
           for (int i=1;i<=idx-1;i++){
               temp = temp.next;
           }
           temp.next = temp.next.next;
           tail = temp;
           size--;
       }

   }

}
public class basicsll {
    public static void main(String[] args) {
       LinkedList ll = new LinkedList();
            ll.insertAtHead(4);
            ll.insertAtHead(5);
            ll.insertAtEnd(6);
            ll.insertAtHead(5);
            ll.display();
        System.out.println();
            ll.insert(1,6);
            ll.display();
        System.out.println(ll.size); ll.size();
        ll.delete(1);
        ll.display();
        System.out.println(ll.size());
    }
}
