/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.carfilter;
import java.io.*;
import java.util.*;


/**
 *
 * @author IDC-205
 */

/**
 Car Filter
Description
You are given the model numbers of a car and its corresponding version. 
* You have to sort the input according to car model and if the model number is the same then 
* you need to sort them according to their version. 
  Input format: 
    The first line contains an integer "n" denoting the number of cars. 
    The "n" following lines have the car model(m) car and the car version(v). 
     5 
    1 2  
    2 3 
    1 1 
    2 5 
    2 4 
    Output format:
    Print the sorted car models with their versions.
    1 1
    1 2 
    2 3 
    2 4
    2 5  

Note:
Input Constraints 
1<=N<=10^5 
-10^9<=m,v<=10^9
Execution time limit

5 seconds
*/
public class CarFilter {

    

    public static void main(String args[]) throws Exception{
		/* Add your code here */
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line1= br.readLine().trim();
        HashMap map = new HashMap<>();
        for (int i = 0; i < Integer.valueOf(line1); i++) {
              String line2[]= br.readLine().split(" ");
                if(map.containsKey(line2[0])){
                    LinkedList list1 = (LinkedList)map.get(line2[0]);
                    list1.push(line2[1]);
                    map.put(line2[0], list1);
                }else{
                    LinkedList list1 = new LinkedList();
                    list1.push(line2[1]);
                    map.put(line2[0], list1);
                }
            }
                Set set = (Set) map.entrySet(); 
		Iterator iterator = set.iterator();
            while (iterator.hasNext()) {
		Map.Entry mapEntry = (Map.Entry) iterator.next();
			
		String keyValue = (String) mapEntry.getKey();
		//Get Value
		LinkedList value = (LinkedList) mapEntry.getValue();
                value.sort(Comparator.naturalOrder());
                for (int i = 0; i < value.size(); i++) {
                    String str = (String)value.get(i);
                System.out.println(keyValue + " " + str);
                }
	}

    
    }

}    


