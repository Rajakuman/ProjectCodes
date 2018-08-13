/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abstract1;

/**
 *
 * @author IDC-205
 */
public class Source {
    public static void main(String[] args) {
	      Stack newStack = new Stack(10); 
	      newStack.add(2,3);
	      newStack.multiply(8,9);
	      newStack.displayOperationTop5();
	      newStack.divide(6,3);
	      newStack.subtract(45,44);
	      newStack.add(18,0);
	      newStack.multiply(6,newStack.peek());
	      newStack.displayOperationTop5();
	      newStack.divide(2,3);
	      newStack.subtract(3,newStack.peek());
	   }
}
