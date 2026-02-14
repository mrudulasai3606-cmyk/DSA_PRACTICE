package Queue;

import java.sql.SQLOutput;

public class ArrayImpl {
     static class QueueA{
        int arr[] = new int[50];
        int f =-1;
        int r =-1;
        int size =0;
        public void add(int val){
            if(f== -1 && r==-1){
                f=r=0;
                arr[0] = val;
                size++;
                return;
            }
            arr[r+1] = val;
            r++;
            size++;
        }
        public int remove(){
            int x = arr[f];
            f++;
            size--;
            return x;
        }
        public int peek(){
            return arr[f];
        }
        public void display(){
            if(isEmpty()) {
                System.out.println("Queue is empty");
                return;
            }
            for(int i=f;i<=r;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        public boolean isEmpty(){
            if(f== -1 && r==-1) return true;
            return false;
        }
    }
    public static void main(String[] args) {
        QueueA q = new QueueA();
        q.display();
        q.add(6);
        q.add(4);
        q.add(5);
        q.add(7);
        q.add(2);
        q.display();
        System.out.println(q.peek());
        q.remove();
        q.remove();
        q.display();
        System.out.println(q.size);
    }
}
