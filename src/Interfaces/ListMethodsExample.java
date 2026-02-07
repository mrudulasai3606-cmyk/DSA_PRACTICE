package Interfaces;
import java.util.Arrays;
import java.util.*;
public class ListMethodsExample {
    public static void main(String[] args) {
//        List <String> fruit = new ArrayList<>();
//        fruit.add("Apple");
//        fruit.add("Banana");
//        fruit.add("Cherry");
//        fruit.add("Dragon");
//        System.out.println("Fruits of ArrayList are:"+fruit);
//        List<String> morefruits = Arrays.asList("Date","BlueBerry");
        List <String> list1 = new ArrayList<>();
        list1.add("a");
        List <String> list2 = new ArrayList<>();
        list2.add("b");
        List <String> list3 = new ArrayList<>();
        list3.add("c");
        List <String> joined = new ArrayList<>();
        joined.addAll(list1);
        joined.addAll(list2);
        System.out.println(joined);
        joined.addAll(list3);
        System.out.println("Joined List is"+joined);


    }
}
