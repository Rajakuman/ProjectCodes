/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sampleapp;

 import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;
import java.util.StringTokenizer;

class Operations{
	//TODO
	int a;
	int b;
	public Operations(int a1,int b1){
	    a=a1;
	    b=b1;
	}
	public int addition(){
	    return a+b;
	}
	public int subtraction(){
	    return a-b;
	}
	public int multiply(){
	    return addition()*subtraction();
	}
	
}

 class Source {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	/*Scan input numbers (using buffered reader), call constructor of Operations class and then call multiply*/    	
//    	   Scanner sc = new Scanner(System.in);
    Source s = new Source();
    s.getString(br);
    
    
    
    
    }

public static void getString(BufferedReader br) throws IOException {
        int no_of_input=Integer.valueOf(br.readLine());
           Integer array[] = new Integer[no_of_input];
           String lines=br.readLine();
           StringTokenizer st= new StringTokenizer(lines, " ");
           int rows=0;
           while(st.hasMoreTokens()){
               array[rows] = Integer.parseInt((String)st.nextElement());
               if (array[rows]%2==1) array[rows]++;
               rows++;
            }
           for (int i = 0; i < array.length ; i++) {
               System.out.print(array[i]+" ");
            }

}
 }
