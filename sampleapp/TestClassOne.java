/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sampleapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author IDC-205
 */
public class TestClassOne {

    
    
    public static void main(String arg[] ) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int no_of_input=Integer.valueOf(br.readLine());
            String[] strNums1 = new String[no_of_input];
            for (int i = 0; i < no_of_input; i++) {
                String lines=br.readLine();
                StringTokenizer st= new StringTokenizer(lines, " ");
                int rows=0;
           while(st.hasMoreTokens()){
               st.nextElement();
               rows++;
            }
           strNums1[i] = String.valueOf(rows);
            }
            for (int i = (no_of_input-1); i >=0 ; i--) {
                System.out.println(strNums1[i]);
            }
    }
}
//5
//1 25 6
//1 2 3 4 5 6 7
//6 6 9 8 9
//5 6 84 26 6 9 52 2
//5
//1