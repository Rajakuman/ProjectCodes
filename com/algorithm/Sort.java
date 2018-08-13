/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algorithm;

/*
 * Copyright (c) 1995, 2008, Oracle and/or its affiliates. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *   - Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *
 *   - Neither the name of Oracle or the names of its
 *     contributors may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */ 

import java.util.*;

public class Sort {
    static void  swap(Integer i, Integer j){
        Integer k=i;
         i=j;
         j=k;
    }
    public static void  sort3(){
        char c;
        char [] input = {'a','b','c','d','e'};
//        int[] input = { 4, 78, 1, 12 };
		int i;
		int j;
		for (i = 0, j = input.length - 1; i < j; i++, j--) {
			c = input[i];
			input[i] = input[j];
			input[j] = c;
		}
		System.out.println(input);
    }
    public static void sort2(){
        int[] input = { 4, 78, 1, 12 };
for (int i = 0; i < input.length; i++) {
	for (int j = 0; j < input.length - i - 1; j++) {
		if (input[j] > input[j + 1]) {
			int temp = input[j + 1];
			input[j + 1] = input[j];
			input[j] = temp;
		}
	}
	for (int k = 0; k < input.length; k++) {
		System.out.print(input[k] + " ");
	}
	System.out.print("--- ");

}
    }
    public static void sort1(){
        int n=5;
        Integer input[] =new  Integer[]{61,62,20,60,21};
//        input={20,5,8,60,21}
//        input.add(0,20);
               print(input);
        Integer k=null;
//        for (int i = 0; i < n - 1; i++) { 
//	for (int j = i + 1; j < n; j++) {

for (int i = 0; i < n - 1; i++) {
	for (int j = i + 1; j < n; j++) {
            if (input[j] < input[i]){
//                            System.out.println("--------------------"+i+"  "+j);
//                            System.out.println("input i:"+i+"   "+input[i]);
//                            System.out.println("input j:"+j+"   "+input[j]);
//                            System.out.println("--------------------"+i+"  "+j);
                            k=input[i];
                            input[i]=input[j];
                            input[j]=k;
//                            System.out.println("--------------------"+i+"  "+j);
//                            System.out.println("input i:"+i+"   "+input[i]);
//                            System.out.println("input j:"+j+"   "+input[j]);
//                            System.out.println("--------------------"+i+"  "+j);
                }
                }
}
            System.out.println("");
        print(input);
    }
    static public void print(Integer input[]){
                    for (int j = 0; j < input.length; j++) {
                System.out.print(" "+input[j]);
            }

    }
    public static void main(String[] args) {
//        args;
//sort1();
//sort2();
sort3();
//        List<String> list = Arrays.asList(args);
//        Collections.sort(list);
//        System.out.println(list);
    }
}
