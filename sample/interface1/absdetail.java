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
abstract class absdetail{
	//Include a member variable named father
	//Include getter and setter methods for this variable
    public String fatherName=null;

    /**
     * @return the fatherName
     */
    public String getFatherName() {
        return fatherName;
    }

    /**
     * @param fatherName the fatherName to set
     */
    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }
}
