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
class Report extends Student implements year{
	private int ptage;
	private String pass = null;
	public Report(String name, int ANo, int STD, int ptage, String pass) {
		super(name, ANo, STD);
		this.ptage = ptage;
		this.pass = pass;
	}
	public int getptage() {
		return ptage;
	}
	public String getpass() {
		return pass;
	}
	@Override
    public int getYear(int std) {
		return (12-std);   
    }
    public void quality(int ANo,int avg){
        if (ptage>avg){
                    System.out.println("Above average student");
                }else{
                    System.out.println("Below average student");
                }
    }
        @Override
        public void quality(int ANo){
		super.quality(ANo);
	}    
	//overload the quality method here
}
