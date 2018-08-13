/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algorithm;
//Write  Java code for bubble sort. Print the sorted array elements space separated in a single line using Arrays.toString

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**Write  Java code for bubble sort. Print the sorted array elements space separated in a single line using Arrays.toString
 *
 * @author IDC-205
 */
public class Source {
    
//    public static int[] sort ( int[] numbers){
//                   for(int i=0;i<numbers.length;i++){
//                       int j = i;
//                    while(j>0){
//                          //not in order
//                if(numbers[j-1] > numbers[j])
//                {
//                    //swapping
//                    int temp = numbers[j-1];
//                    numbers[j-1] = numbers[j];
//                    numbers[j] = temp;
//                }//in order
//                else
//                {
//                    break;
//                }
//                j--;
//              }
//           }
           
//           for(int x : numbers)
//        {
//            System.out.print(" "+x);
//        }
//           return numbers;
//       }

    
    public static int[] sort ( int[] numbers){
        ArrayList<String> s = new ArrayList<String>();
        
                              for(int i=0;i<numbers.length;i++){
                       int j = i;
                    while(j>0){
                          //not in order
                if(numbers[j-1] > numbers[j])
                {
                    //swapping
                    swap(i, j, numbers);
//                    int temp = numbers[j-1];
//                    numbers[j-1] = numbers[j];
//                    numbers[j] = temp;
                }//in order
                else
                {
                    break;
                }
                j--;
              }

       }
                              return numbers;
       }
    
 public static void swap(int i, int j, int[] array) {
       int temp = array[i];
       array[i] = array[j];
       array[j] = temp;
       System.out.println("temp"+temp);
   }
    
	//You might need a swap function also.
   public static void main(String args[]) {
//       int[] randomNumbers = {13, 3242, 23, 2351, 352, 3915, 123, 32, 1, 5, 0};
       int[] randomNumbers = {4,3,2,10,12,1,5,6};
       System.out.println(Arrays.toString(randomNumbers));
       int[] sortedNumbers;
       sortedNumbers = sort1(randomNumbers);
       System.out.println(Arrays.toString(sortedNumbers));
    }
   
   public static int[] sort1 (int[] numbers){
       int n = numbers.length;
		for (int i=1; i<n; ++i)
		{
			int key = numbers[i];
			int j = i-1;
			while (j>=0 && numbers[j] > key)
			{
				numbers[j+1] = numbers[j];
				j = j-1;
			}
			numbers[j+1] = key;
		}
                System.out.println("");
   return numbers;
   }
}
