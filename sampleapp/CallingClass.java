/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sampleapp;

/**
 *
 * @author IDC-205
 */
public class CallingClass {
	public static void main(String[] args) {
		MathematicalOperations mathematicalOperations = new MathematicalOperations();
		int sum = mathematicalOperations.addition(9,5);
		System.out.println("The sum is: " +sum);
		sum = mathematicalOperations.subtraction(9,5);
		System.out.println("The sum is: " +sum);
	}
}
