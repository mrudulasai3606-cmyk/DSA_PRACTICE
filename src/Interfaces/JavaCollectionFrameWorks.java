package Interfaces;
/*
Java Collection framework provides a set of interfaces and classes to implement various data structure and algorithms
TYPES OF COLLECTION:
1. Collection Interface:-
   * List - ArrayList,LinkedList
   * Set  - HashSet,TreeSet
   * Queue - Priority Queue, Linkedlist
   * Dequeue-ArrayDequeue
2. Map Interface:-
   Example:- HashMap,TreeMap,LinkedHashMap
3. Specialized Collection:-
   SortedSet,NavigableSet,SortedMap,NavigableMap
                    DIAGRAM

           Collection                                   Map                     Iterator

   1.List       2.Set           3.Queue             SortedAMap                ListIterator

                SortedSet       Dequeue

Methods Of Collection:-
add():
size():
remove():
iterator():
addAll():
removeAll():
clear():
The list interface is an collection to access and store sequentially
 */
/*
Methods in list:
add(),addAll(),get(),iterator(),set();
 */
import java.util.*;
public class JavaCollectionFrameWorks {
    public static void main(String[] args) {
        List  <String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("apple");
        fruits.add("Cherry");
        fruits.add("Dragon");
        System.out.println("Fruits List is"+fruits);



    }

}
