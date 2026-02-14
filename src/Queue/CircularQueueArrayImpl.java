package Queue;

public class CircularQueueArrayImpl {
    public static class CQ{
        int n =8;
        int arr[] = new int[n];
        int size=0;
        int  f =-1;
        int r =-1;
        public void add(int val) throws Exception{
            if(size==0){
                f = r =0;
                arr[0] = val;
            }
            else if(size==n){
                throw new Exception("Queue is Full");
            }
            else if(r<n-1){
                arr[r+1] = val;
                r++;
            }
            else{ // r== n-1
                r =0;
                arr[0] = val;
            }
            size++;
        }
        public int remove() throws Exception{
            if(size==0){
                throw new Exception("Queue is Empty");

            }
            else if(f<n-1){
                int x = arr[f];
                f++;
                size--;
                return x;
            }
            else{
                int x = arr[f];
                f =0;
                size--;
                return x ;
            }
        }
        public void display(){
            if(size==0) {
                System.out.println("Queue is Empty");
            }
            if(f<r){
                for(int i=f;i<=r;i++){
                    System.out.print(arr[i]+" ");

                }

            }
            else if(f>r){
                for(int i=f;i<n;i++){
                    System.out.print(arr[i]+" ");

                }
                for(int i=0;i<=r;i++){
                    System.out.print(arr[i]+" ");

                }
            }
        }
    }
    public static void main(String[] args)  throws  Exception{
        CQ cq = new CQ();
        cq.display();
        cq.add(20);
        cq.add(25);
        cq.add(45);
        cq.add(78);
        cq.add(67);
        cq.add(89);
        cq.display();//20 25 45 78 67 89
        System.out.println();
        cq.remove(); // 25 45 78 67 89
        cq.display();
    }
}
