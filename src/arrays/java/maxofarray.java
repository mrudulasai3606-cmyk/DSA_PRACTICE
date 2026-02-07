package arrays.java;

public class maxofarray {
    public static void main(String[] args) {
        int a[] ={12,34,45,56,67,78,890,90};
        int max=a[0];
        for(int i=0;i<a.length;i++){
            if(max<a[i]){
               max = a[i];
            }
        }
        System.out.println("Max ele"+max);
    }
}
