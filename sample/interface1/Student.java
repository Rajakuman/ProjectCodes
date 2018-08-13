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
class Student  extends absdetail{
	public String name = null;
	public int ANo;
	public int STD;

	public Student(String name, int ANo, int STD,String father) {
		this.name = name;
		this.ANo = ANo;
		this.STD = STD;
                super.fatherName=father;
	}
	//Define the methods here

	public String getName() {
		return name;
	}

	public int getANo() {
		return ANo;
	}

	public int STD() {
		return STD;
	}

    @Override
    public String getFatherName()  {
        return fatherName;
    }
}
