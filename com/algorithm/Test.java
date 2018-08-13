/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algorithm;

/**
 *
 * @author IDC-205
 */
public class Test {
    public static void sample3(){
        int m=0;
        int n=16;
//                int i = 0;
//        for (int j = 1; j <= n; j++) {
//                for (int i = n; i >= 1; i = i / 2) {
//                    k++;
//				System.out.println(" i value is : " + i+"--->"+k);
//			}
//		}

for (int j = 1; j <= n; j++) {
			for (int k = 1; k <= n; k++) {
				for (int i = n; i >= 1; i = i / 2) {
                    m++;
				System.out.println(" i value is : " + i+"--->"+m);
				}
			}
		}
    }

    public static void sample2(){
        int k=0;
        int n=6;
        int i = 0;
		while (i < n) {
			int[] tempArray = new int[n];
			for (int j = 0; j < n; j++){
                            k++;
				tempArray[j] = i * j;
		System.out.println(" i value is : " + i+"  -->"+j+"-->"+k);
                        }
			i++;
		}
    }
    public static void sample1(){
        int k=0;
        int n=10;
        int i = 0, j = n;
		while (i <= j) {
                        System.out.println(" i value is : " + i+"  -->"+j+"-->"+k);
                    k++;
			i++;
			j--;
                }
    }
    public static void sample(){
                int k=0;
                int n=10;
		for (int j = n; j >= 1; j--) {
			for (int i = 1; i <= n; i++) {
				System.out.println(" i value is : " + i+"  -->"+(++k));
			}
		}
	}
   
    
	public static void main(String[] args) {
		// n is user input value
                sample3();
                int[] input = new int[]{2,2,3,4,4};
                heapify(input, 2, 2);
    }

private static void heapify(int[] input, int n, int i) {
	int largest = i;
	int left = 2 * i + 1;
	int right = 2 * i + 2;
	if (left < n && input[left] < input[largest])
	    largest = left;
	if (right < n && input[right] < input[largest])
 	    largest = right;
	if (largest != i) {
		int temp = input[i];
		input[i] = input[largest];
		input[largest] = temp;
		heapify(input, n, largest);
	}
}

}