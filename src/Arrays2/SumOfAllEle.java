package Arrays2;

public class SumOfAllEle {
    public static void main(String[] args) {
        int[] arr = {23,45 ,56,67,78,97};
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}
