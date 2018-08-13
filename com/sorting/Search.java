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
public class Search {
//	public static void main(String[] args) {
//		int[] arr = { 1, 3, 5, 7, 14, 18, 24, 26, 32 };
//		int low = 0, high = arr.length - 1;
//		int element = 26;
//		int result = BinarySearch(arr, low, high, element);
//	}
//
//	public static int BinarySearch(int[] arr, int low, int high, int element) {
//
//		while (low <= high) {
//			int middle = (low + high) / 2;
//			System.out.print(middle + " ");
//			if (arr[middle] > element) {
//				high = middle;
//			} else if (arr[middle] < element) {
//				low = middle;
//			} else if (arr[middle] == element) {
//				return 1;
//			}
//		}
//		return 0;
//	}
    
    
//    public static void main(String [] args){
//		int [] arr = {1,5,2,7,0,12,-5};
//		int low = 0, high = arr.length-1;
//		int element = 0;
//		if(BinarySearch(arr,low,high,element)==0){
//			System.out.println("Element does not exist");
//		}else{
//			System.out.println("Element exists");
//		}
//	}
//	public static int BinarySearch(int [] arr,int low, int high, int element){
//		while(low<high){
//			int middle = (low+high)/2;
//			if(arr[middle]>element){
//				high = middle; 
//			}else if(arr[middle]<element){
//				low = middle;
//			}else if(arr[middle]==element){
//				return 1;
//			}
//		}
//		return 0;
//	}
    
    
    public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7,20,25 };
		int low = 0, high = arr.length - 1;
		int element = 25;
		if (BinarySearch(arr, low, high, element) == 0) {
			System.out.println("Element does not exist");
		} else {
			System.out.println("Element exists");
		}
	}

	public static int BinarySearch(int[] arr, int low, int high, int element) {
		while (low < high) {
			int middle = (low + high) / 2;
			if (arr[middle] > element) {
				high = middle;
			} else if (arr[middle] < element) {
				low = middle;
			} else if (arr[middle] == element) {
				return 1;
			}
		}
		return 0;
	}
}
