package Arrays2;

public class PrefixSum {
    static void printArray(int arr[]){
        for(int ele: arr){
            System.out.print(ele+" ");
        }
    }
  public  static int[] Pref(int arr[]){
          int n = arr.length;
          int ans[] = new int[n];
          ans[0]= arr[0];
          for(int i=1;i<n;i++){
              ans[i] = ans[i-1] + arr[i];
          }
          return ans;
    }
    public static void main(String[] args) {
        int arr[] ={1,2,4,5,6,8,9,1};
        printArray(arr);
        int pref[] = Pref(arr);
        System.out.println();
        printArray(pref);
    }
}
