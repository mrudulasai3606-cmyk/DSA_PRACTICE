package Stacks;

public class LinkedListStack {
    public static class Node{//User definbed Data Type
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class StackLL{//User defined Data Structure
        private Node head;
        private int size;
        public void push(int x){
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }
        public int pop(){
            if(size==0){
                System.out.println("Stack underFlow");
                return -1;
            }
            int ele = head.data;
            head = head.next;
            size--;
            return ele;

        }
        public int peek(){
            return head.data;
        }
        public int size(){
            return  size;
        }
        public void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }

        private void displayrec(Node h) {
            if(h==null) return;
            displayrec(h.next);
            System.out.print(h.data+" ");
        }

    }
    public static void main(String[] args) {
        StackLL st = new StackLL();
        st.push(10);//10
        st.push(20);//10 20
        st.push(30);// 10 20 30
        st.push(50);//10 20 30 50
        st.display();
        st.pop();// 10 20 30
        System.out.println();
        st.display();
        System.out.println();
        st.peek();

    }
}
