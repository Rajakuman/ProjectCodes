/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample.encapsulation;

/**
 *
 * @author IDC-205
 */
public class DriverClass {
	public static void main(String[] args) {
		Employee e = new Employee();
		System.out.println(e.getEmployeeName("Pradhan", "Mishra",12345));
	}
}
