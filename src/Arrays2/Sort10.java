package Arrays2;

public class Sort10 {
    public static void printArray(int arr[]) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 0, 1, 0, 0, 1};
        int i = 0, j = arr.length - 1;
        printArray(arr);
        System.out.println();
        while(i<j) {
            if (arr[i] %2 == 0) {
                i++;
            }
             if (arr[j] %2 == 1) {
                j--;
            }
            if(arr[i] %2 ==1 && arr[j]==0 && i<j) {
               arr[i]=0;
               arr[j]=1;
               i++;
               j--;
            }
            printArray(arr);
        }
    }
}
