package sampleapp.ll;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IDC-205
 * Description
*  Given below is the code for ArrayList, which contains an ArrayList named "random" with six elements 
* — 2, 4, 5, 10, 99.9, and 101 — stored as float-type values. 
* The code prints all the elements using a ‘for’ loop. Modify 
* this code to print all the elements backwards ‘iteratebwd()’ (starting from the last element of the list), 
* using the ListIterator interface. Make another method ‘iterateAltn( )’, 
* with a code that prints the elements stored at the even positions of ArrayList, 
* i.e. print alternate elements, starting from index 1, again using the ListIterator interface.
* Expected Output:  
101.0
99.9
10.0
5.0
4.0
2.0
4.0
10.0
101.0
 */
public class Source {
    
    public static void iteratebwd(ListIterator<Float> iterator){
         while(iterator.hasPrevious())
        {
            System.out.println(iterator.previous());
        }
    }
    
    public static void duplicateFind(){
          LinkedList<String> myStrings = new LinkedList<String>();
    myStrings.add("hello");
    myStrings.add("world");
    myStrings.add("to you");
    myStrings.add("friend");
    myStrings.add("hello");
    myStrings.add("world");
    myStrings.add("to you");
    myStrings.add("too");
        printList(myStrings);
        LinkedList<String> duplicate = new LinkedList<String>();
        LinkedList<String> unique = new LinkedList<String>();
        for(int i=0; i<myStrings.size(); ++i){
            if(unique.contains(myStrings.get(i))){
                duplicate.add(myStrings.get(i));
            }else{
                unique.add(myStrings.get(i));
            }
        }
        System.out.println("-----------------------Duplicate-----------------------");
        printList(duplicate);
        System.out.println("-----------------------Unique-----------------------");
        printList(unique);
    }
     public static void main(String[] args) {
         duplicateFind();
    }
     
public static void orderList(){
             List<Float> random = new ArrayList<Float>();
       random.add(2f);
       random.add(4f);
       random.add(5f);
       random.add(10f);
       random.add(99.9f);
       random.add(101f);

       iteratebwd(random.listIterator(random.size()));
          printList(random);

}
   public static void printList(List<Float> arr) {
       for( int i=0 ; i<arr.size();++i) {
           if (i%2==1)
           System.out.println(arr.get(i));
       }
   }
   public static void printList(LinkedList<String> arr) {
       for( int i=0 ; i<arr.size();++i) {
           System.out.println(arr.get(i));
       }
   }
}
