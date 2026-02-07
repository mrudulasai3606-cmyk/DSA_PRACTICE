package Arrays2;
class A{
    static void printArray(int arr[]){
        for(int ele: arr) {
            System.out.print(ele + " ");
        }
    }
    static int[] pref(int arr[]){
        for(int i=1;i< arr.length;i++){
            arr[i] = arr[i] + arr[i-1];
        }
        return arr;
    }
}

public class PrefixSum2 {

    public static void main(String[] args) {
        int arr[] ={1,2,3,7,5,4,5};
        A a = new A();
        a.printArray(arr);
        System.out.println();
        int pref[] =  a.pref(arr);
        a.printArray(pref);
    }
}
