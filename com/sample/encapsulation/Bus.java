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
class Bus extends Student {
	private int route;
	private String BG = null;
	public Bus(String name, int ANo, int STD, int route, String BG) {
		super(name, ANo, STD);
		this.BG = BG;
		this.route = route;
	}
	public String getBG() {
		return BG;
	}
	public int getroute() {
		return route;
	}
        
        @Override
        public void quality(int ANo){
		if (ANo>=20){
                    System.out.println("Out of city student");
                }else{
                    System.out.println("In-city student");
                }
	}
}
