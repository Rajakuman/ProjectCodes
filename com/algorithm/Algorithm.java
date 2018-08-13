/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author IDC-205
 */
public class Algorithm {

    public static int FindSum(int[] input) {
	int sum = 0;
	for (int i = 0; i < input.length; i++) {
		sum = sum + input[i];
	}
	return sum;
}
static int n=0;    
    public static int sum(int i){
    for (int j = 0; j <=i; j++) {
        n=n+j;
        System.out.println("n:"+n+"   "+j);
//    break;
        }
        return n;
    }
    
    public static void main(String[] args) throws IOException {
        // n is user input value
        System.out.println("out:"+sum(10));
//        int[] input = new int[4];
//        input[0]=20;
//        input[1]=22;
//        input[2]=33;
//        input[3]=10;
//        System.out.println("        FindSum(input)"+        FindSum(input));
;
//        
//        sample();
//        sample1();
//        int ss =sample2(25);
//        System.out.println("\nsample2::::"+sample2(25)); ;
//        Integer[] strNums2 = new Integer[20];
////        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
////        strNums2 = br.readLine().split("\\s");
//        strNums2[0] = ((ss) * (2)) + 1;
//        for (int i = strNums2[0]; i >= 1; i = i / 2) {
//            System.out.println(" i value is : " + i);
//        }
    }

    public static void sample() {
        int[] inputArray = {5, 4, 78, 1, 12, 14, 10, 8, 7};
        int toFind = 10;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == toFind) {
                System.out.println("Element Found");
                break;
            } else {
                System.out.println("Element Not Found");
                break;
            }
        }
    }

    public static void sample1() {
        int[] inputArray = {5, 4, 10, 8, 7, 78, 1, 12, 14,};
        int maximum = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] > maximum) {
                maximum = inputArray[i];
            }
        }
        System.out.println("The maximum element is: " + maximum);

    }

    public static int sample2(int fibNumber) {
//        int fibNumber = 9;
        int[] fibArray = new int[fibNumber + 1];
        fibArray[0] = 0;
        fibArray[1] = 1;
        for (int i = 2; i <= fibNumber; i++) {
            fibArray[i] = fibArray[i - 1] + fibArray[i - 2];
        }
        for (int i = 0; i <= fibNumber; i++) {
            System.out.print(fibArray[i] + " ");
        }
    return fibArray[fibNumber];
    }

}
