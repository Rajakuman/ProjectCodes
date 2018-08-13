/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upgrad.hash.collision;

/**
 *
 * @author IDC-205
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
/*
* Design a simple hashing algorithm which hashes different string keys to different integer values. 
* Note that you will be given three different strings in each test case and your algorithm should always hash them to 
* different integers in the range of 0 to 9 (both included). You just have to modify the hashFunction method of 
* the Source class. Do not change the main method. If your algorithm works correctly, 
* ‘Correct’ will be printed on the output, and nothing will be printed if it doesn’t.
* Sample input:
* ABC
* DEF
* GHI
*/
//Chlorenchyma in plants
//Resident of England
//Dutchess
//ABC
//DEF
//GHI
//abc
//def
//ghi

public class Source { 
static int hashFunction(String key) {
	    //Todo
    int hashKey=0;
    String[] data = new String(key).split(" ");
    for (StringTokenizer stringTokenizer = new StringTokenizer(key); stringTokenizer.hasMoreTokens();) {
        String token = stringTokenizer.nextToken();
        StringBuffer sb = new StringBuffer(token);
        for (int i = 0; i < sb.length(); i++) {
            hashKey=hashKey+((sb.codePointAt(i))*i);
        }
    }
    hashKey=(hashKey%10);
return hashKey;
}



public static void main(String[] args) throws IOException{  
	int[] array = new int[3];
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	for(int i = 0;i<3;i++)
		array[i] = hashFunction(br.readLine());
    int flag=0;
    for (int j=0;j<3;j++) {
    	for (int k=j+1;k<3;k++) {
    		 if (array[k] >9 ||array[j]>9||(k!=j && array[k] == array[j]))
             {
             	flag=1;
             	break;
             }
    	}
    	if (flag==1)
    		break;
    }
    if(flag==0)
    	System.out.println("Correct");
}  
}
