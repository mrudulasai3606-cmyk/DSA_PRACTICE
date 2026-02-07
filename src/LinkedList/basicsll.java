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
    int size;
     void insertAtHead(int val){
         Node temp = new Node(val);

         if(head==null){
             head= tail= temp;
         }
         else{
         temp.next = head;
         temp = head;}
         size++;
     }
     void inserAtTail(int val){
         Node temp = new Node(val);
         if(tail==null){
             tail = head = temp;
         }
         else{
         tail.next = temp;
         tail = temp;}
         size++;
     }
     void insert(int val,int idx){
         Node temp = head;
         Node t = new Node(val);
         for(int i=0;i<idx-1;i++){
             temp = temp.next;
         }
         t.next = temp.next;
         temp.next = t;
     }
     void display(){
         Node temp = head;
         while(temp!=null){
             System.out.print(temp.val+"");
             temp = temp.next;
         }
     }
}
public class basicsll {
    public static void main(String[] args) {
       LinkedList ll = new LinkedList();
       ll.insertAtHead(10);
       ll.display();
    }
}
