/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.interface1;

/**
 *
 * @author IDC-205
 */
class Bus extends Student {
	public int route;
	public String BG = null;
	public Bus(String name, int ANo, int STD, int route, String BG,String fatherName) {
		super(name, ANo, STD,fatherName);
		this.BG = BG;
		this.route = route;
	}
	public String getBG() {
		return BG;
	}
	public int getroute() {
		return route;
	}

       public String getFather(){
            return super.getFatherName(); 
        }
 }
