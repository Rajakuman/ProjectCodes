/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sorting;

/**
 *
 * @author IDC-205
 */
import java.util.Arrays;
public class Source {
    
       public static int[] selectionSort ( int[] numbers){
	for (int i = 0; i < (numbers.length)-1; i++) {
            int min_idx = i;
                for (int j = i+1; j < (numbers.length); j++)
                        if (numbers[j] < numbers[min_idx])
                                min_idx = j;
                int temp = numbers[min_idx];
                numbers[min_idx] = numbers[i];
                numbers[i] = temp;
	}
           return numbers;
       }
       
       public static int[] heapSort ( int[] numbers){
           for (int i = numbers.length / 2 - 1; i >= 0; i--)
		heapify(numbers, numbers.length, i);
           for (int i=numbers.length-1; i>=0; i--) {
			int temp = numbers[0];
			numbers[0] = numbers[i];
			numbers[i] = temp;
			heapify(numbers, i, 0);
		}
           
           return numbers;
       }
       
       
       public static void heapify(int[] numbers, int n, int m){
           	int largest = m;
		int l = 2*m + 1;
		int r = 2*m + 2;

		if (l < n && numbers[l] > numbers[largest])
			largest = l;

		if (r < n && numbers[r] > numbers[largest])
			largest = r;
		if (largest != m)
		{
			int swap = numbers[m];
			numbers[m] = numbers[largest];
			numbers[largest] = swap;
			heapify(numbers, n, largest);
		}
       }
       
//       void sort(int arr[], int l, int r)
//	{
//		if (l < r)
//		{
//			// Find the middle point
//			int m = (l+r)/2;
//
//			// Sort first and second halves
//			sort(arr, l, m);
//			sort(arr , m+1, r);
//
//			// Merge the sorted halves
//			merge(arr, l, m, r);
//		}
//	}
       
       	public static void merge(int[] numbers, int l, int m, int r) {
		int n1 = m - l + 1;
		int n2 = r - m;

		int L[] = new int [n1];
		int R[] = new int [n2];

		for (int i=0; i<n1; ++i)
			L[i] = numbers[l + i];
		for (int j=0; j<n2; ++j)
			R[j] = numbers[m + 1+ j];


		int i = 0, j = 0;
		int k = l;
		while (i < n1 && j < n2)
		{
			if (L[i] <= R[j])
			{
				numbers[k] = L[i];
				i++;
			}
			else
			{
				numbers[k] = R[j];
				j++;
			}
			k++;
		}

		while (i < n1)
		{
			numbers[k] = L[i];
			i++;
			k++;
		}
                while (j < n2)
		{
			numbers[k] = R[j];
			j++;
			k++;
		}
	}
        
      public static int[] mergeSort ( int[] numbers,int l,int r){
           if (l < r)
		{
			int m = (l+r)/2;
			numbers=mergeSort(numbers, l, m);
			numbers=mergeSort(numbers , m+1, r);
			merge(numbers, l, m, r);
		}
           
           return numbers;
       }
	//Include the method for merging two arrays over here.
   
public static int[] sort ( int[] numbers){
            mergeSort(numbers, 0, numbers.length-1);
           return numbers;
       }
	//You might need a swap function also.
   public static void main(String args[]) {
       int[] randomNumbers = {13, 3242, 23, 2351, 352, 3915, 123, 32, 1, 5, 0};
       int[] sortedNumbers;
//       sortedNumbers = selectionSort(randomNumbers);
//       sortedNumbers = heapSort(randomNumbers);
       sortedNumbers = sort(randomNumbers);
       System.out.println(Arrays.toString(sortedNumbers));
}
   
   public static int[] sort1 ( int[] numbers){
       int[] randomNumbers = {2,4,6,8,10,12,14,16,18,20};
       int[] sortedNumbers=null;
       System.out.println(Arrays.toString(sortedNumbers));
       return numbers;
   }
}