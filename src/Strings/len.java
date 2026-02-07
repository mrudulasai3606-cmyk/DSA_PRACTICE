package Strings;

public class len {
    public static void main(String[] args) {
        String str = "Mrudula   ";
        int i = 0;
        try {
            while (true) {
                char ch = str.charAt(i);
                i++;
            }
        }
        catch (Exception e){

        }
        System.out.println(i);
        char ch[] = str.toCharArray();
        int j =0;
      for(char c: ch){
          j++;

      }

        System.out.println(j);
    }

}
