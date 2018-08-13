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
class Employee {
	private int employeeID;
	private String employeeName;
	private int getEmployeeID(int ID ){
		return this.employeeID = ID;
	}
	public String getEmployeeName(String fName, String lName,int ID){
		this.employeeName = fName+" "+lName;
		this.employeeID = getEmployeeID(ID);
		return employeeName + " has employee ID: " +employeeID;
	}
}
