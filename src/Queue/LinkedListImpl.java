package Queue;

public class LinkedListImpl {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static class QueueL{
        Node head;
        Node tail;
        int size=0;
        public void add(int val){
            Node temp = new Node(val);
            if(head== null && tail == null){
                head = tail = temp;
                size++;
                return;
            }
            tail.next = temp;
            tail = temp;
            size++;
        }
        public int remove(){
            int x = head.val;
            head= head.next;
            size--;
            return x;
        }
        public int peek(){
            return head.val;
        }
        public void display(){
            Node temp = head;
            if(head== null && tail == null){
                System.out.println("Queue is empty");
                return;

            }
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
        }
    }
    public static void main(String[] args) {
        QueueL q= new QueueL();
        q.display();
        q.add(50);
        q.add(45);
        q.add(23);
        q.add(12);
        q.add(67);
        q.display();
        q.remove();
        System.out.println(q.size);
        System.out.println(q.remove());
    }
}
