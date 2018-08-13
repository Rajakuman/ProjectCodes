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
class Report extends Student implements year{

	public int ptage;
	public String pass = null;
        
	public Report(String name, int ANo, int STD, int ptage, String pass,String fatherName) {
		super(name, ANo, STD,fatherName);
		this.ptage = ptage;
		this.pass = pass;
	}
	
        public int getptage() {
		return ptage;
	}
	
        public String getpass() {
		return pass;
	}

        public int getYear(int STD){
            
            return 12-STD;
        }
}
