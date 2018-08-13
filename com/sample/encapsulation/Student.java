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
class Student extends absdetail{
	private String name = null;
	private int ANo;
	private int STD;

	public Student(String name, int ANo, int STD) {
		this.name = name;
		this.ANo = ANo;
		this.STD = STD;
	}
	
	@Override
	public void setFather(String father) {
		this.father = father;
	}
	public String getFather() {
		return father;
	}
	public String getName() {
		return name;
	}

	public int getANo() {
		return ANo;
	}

	public int getSTD() {
		return STD;
	}
	public void quality(int ANo){
		//TODO
                System.out.println("ad no"+ANo);
                if (ANo>=10){
                    System.out.println("New student");
                }else{
                    System.out.println("Old student");
                }
	}
}
