/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upgrad.bloomfilter;

/**
 *
 * @author IDC-205
 */
public class TestClass {
    public static void main(String arg[]){
        System.out.println(grmn("abcdef", "FDEBCA")); ;
    }
    
    public static boolean grmn(String S1, String S2) // Assume S1 and S2 are strings made of lower-case English letters
        {
        char character = 'a';    
            S1=S1.toLowerCase();
            S2=S2.toLowerCase();
	int[] C = new int[26];
               for (int j=0; j<26; j++) { C[j]=0; }
               for (int i = 0; i < S1.length(); i++) {
                   System.out.println("S1.codePointAt(i)"+S1.charAt(i)+"\tS1.codePointAt(j):"+S1.codePointAt(i)+"\tchar a:"+(int) character+"\ttotal array"+(S1.codePointAt(i) - (int) character));
                   C[ S1.codePointAt(i) - (int) character]++;
               }
            System.out.println("-----------");
               for (int j=0; j<S2.length(); j++) {
                   System.out.println("S1.codePointAt(i)"+S1.charAt(j)+"\tS1.codePointAt(j):"+S1.codePointAt(j)+"\tchar a:"+(int) character+"\ttotal array"+(S1.codePointAt(j) - (int) character));
               C[ S2.codePointAt(j) - (int) character]--;
//                   C[asc(S2[j]) – asc('a')]-- ; 
               }
	for (int j=0; j<26; j++) { 
            System.out.println("c["+j+"]:"+C[j]);
            if (C[j]!=0) return false; 
        }
	return true;
    }    
} 

