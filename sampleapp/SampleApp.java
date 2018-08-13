/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sampleapp;

import com.sample.NewClass;

/**
 *
 * @author IDC-205
 */
public class SampleApp {

  
    	static int i = 0; //class variable declaration

    public static void arrayOperation(int[] input) {
			int temp = input[0];
			for(int i=0;i<input.length-1;i++)
				input[i] = input[i+1];
			input[input.length-1] = temp;
		}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        		System.out.println("i value is:" +i);

//        sample1();
//boolean [][] d;

//int [] newarray = {1,2,3,4,5}; 
//int [] newarray = new int [5];
//int newarray[5];
int count = 1;
			int [] input = {1,2,3,4,5};
			for(int i=1;i<=count;i++)
				arrayOperation(input);
                        System.out.println(input.length);
                        System.out.println(i);
			for(int i=0;i<input.length; i++){
//                            	System.out.print(input[i]+" ");
                        	System.out.println(input[i]+"----"+i);
                        }
			
//int [] p; p = new int[5];

//int [] input = {1,2,3,4,5};
//	for (int i=0 ; i<=5 ; i++)
//		System.out.print(input[i]+ " ");




    }
      public  static void sample1() {
            System.out.println("sample1");
            NewClass n1 = new NewClass();
            n1.sample2();
    }
}
