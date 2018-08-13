/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upgrad.hashmap;

/**
 *
 * @author IDC-205
 */
import java.util.HashMap;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
/**
 * 
 * 
 * 
 * HashMap: Two-sum problem
Description
Design an algorithm for the two-sum problem using HashMap. Use the built in Java API’s for the HashMap class. You have to count the number of all the unique pairs possible by picking two elements from the array which sum up to the given target sum. The input will consist of three lines:
The size of the array
Elements of the array (space-separated)
The target sum
Use a HashMap whose key is the element of the array and value determines 
* if the occurrence of that element is single or multiple. 
* You have to output the number of distinct pairs possible. Print 0 if no such pairs are possible. Remember the ordering in the pair doesn’t matter, so (1,3) and (3,1) will be considered the same pair and not two distinct pairs. Complete the main method and the getPairsCount method accordingly.

Sample Input 1:
5
1 2 3 4 5
10
Output:
0
Explanation: No pair of elements sum up to 10

Sample Input 2:
4
1 1 1 1
2
Output:
1
Explanation: There is only 1 unique pair (1,1) which sums up to 2
Execution Time Limit
5 seconds
* 
 */
public class Source
{
    //my function
    static int getPairsCount1(int n, int sum, int[] arr)
    {
        //Todo
        HashMap mp = new HashMap();
        int res=0;
        for (int i = 0; i < n; i++) {
            mp.put(i, arr[i]);
                if((i+arr[i])==sum){
                    res++;
                    int val=-1;
                    if(mp.get(arr[i])!=null) val=(Integer)mp.get(arr[i]);
                    if (val==i && i!=arr[i]  ){
                        res--;
                    }
                }
        }
        return res;
    }

    //upgrad function
        static int getPairsCount(int n, int sum, int[] arr)
    {
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int i=0; i<n; i++){
            if(!hash.containsKey(arr[i])){
                hash.put(arr[i],1);
            System.out.println("true:"+arr[i]+"\ti="+i+"\thash="+hash);
            }else if(hash.get(arr[i])==1){
            	hash.put(arr[i],2);       
                System.out.println("false:"+arr[i]+"\ti="+i+"\thash="+hash);
            }
        }
        System.out.println("hash::"+hash);
        int count = 0;
        for (int i=0; i<n; i++)
        {
        	if((hash.get(arr[i])!=0)&&(hash.get(sum-arr[i])!=null)) {
        		if(sum-arr[i] == arr[i]) {
            		if(hash.get(sum-arr[i]) ==2)
            			count++;
            	}else {
            		if((hash.get(sum-arr[i]) ==1)||(hash.get(sum-arr[i]) ==2))
                        count++;
            	}
        		hash.put(arr[i],0);
        		hash.put(sum-arr[i],0);
        	}          
        }
        System.out.println("hash:::"+hash);
        return count;
    }
        
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line1= br.readLine();
        String line2[]= br.readLine().split(" ");
        String sum= br.readLine();
        int array[] = new int[Integer.valueOf(line1)];
        for (int i = 0; i < Integer.parseInt(line1); i++) {
            array[i]=Integer.valueOf(line2[i]);
        }
        int noofpairs=getPairsCount(Integer.valueOf(line1), Integer.valueOf(sum), array);
         System.out.println(noofpairs);
    
    }
}