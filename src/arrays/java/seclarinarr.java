package arrays.java;

public class seclarinarr {
    public static void main(String[] args) {
        int a[] = {23, 34, 45, 56, 67,98,78 };
        int i,j,temp;
        for(i=0;i<a.length;i++){
            for(j=i+1;j<a.length-i-1;j++){
                if(a[j]<a[j+1]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for ( i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
