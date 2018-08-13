/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.inheritence;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author IDC-205
 */
public class Source {
     public static void main(String[] args) throws IOException {
    	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String[] strNums1, strNums2;
    	strNums1 = replaceStr(br.readLine()).split("\\s");
    	strNums2 = replaceStr(br.readLine()).split("\\s");
        String line = replaceStr(br.readLine());
        if (strNums1[1].equals(line)){
            setStudent(strNums1);
        }else if (strNums2[1].equals(line) ){
            setStudent(strNums2);
        }else{
            System.out.println("No entry found");
        }
    	/*Store these details by making objects of both classes and then with the help of if-else, return the correct output.*/
    }
     public static void setStudent(String strNums[]){
         if (strNums.length==7) {
//          Bus(String name,int ANo,int std,int route,String bloodGroup){
         Bus b = new Bus(strNums[0], Integer.valueOf(strNums[1]), Integer.valueOf(strNums[2]), Integer.valueOf(strNums[5]), strNums[6]);
//        Report(String name,int ANo,int std,int ptage,String pass)
         Report r = new Report(strNums[0], Integer.valueOf(strNums[1]), Integer.valueOf(strNums[2]), Integer.valueOf(strNums[3]), strNums[4]);
             System.out.println(b.name+" "+r.ptage+" "+b.route);
         }
     }
     public static String replaceStr(String str){
         while(str.contains("  ")){
             str=str.replace("  ", " ");
         }
         return str;
     }
     public static int validate(String strNums[] ){
         if (strNums.length!=7) {
             System.out.println("No entry found");
             return 1;
         }
         return 0;
     }
     
     public static void print(String strNums[]){
         System.out.println("Length :"+strNums.length);
         for (String string : strNums) {
             string=string.trim().replace(" ", "");
             System.out.print(" "+string);
         }
     }
     
}
