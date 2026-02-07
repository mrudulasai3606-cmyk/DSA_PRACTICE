package five;

import java.io.FileReader;

public class ExceptionDemo {

    public static void main(String[] args) throws Exception{
        int a =10;
try{
    int arr[] = {1,2,3,34};
    System.out.println(arr[3]);
}
catch (Exception e){
    System.out.println("Arrays "+e);
}

        finally {
           System.out.println("FInallyyyyy");
        }
    }

}
