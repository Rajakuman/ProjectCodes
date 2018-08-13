/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.sampabstract;

/**
 *
 * @author IDC-205
 */
public class IdentityCard extends AadharCard{
	public String name = null;
	public String address = null;
	public String fathersName = null;
	public String dateOfBirth = null;

	public IdentityCard(String name, String address, String fathersName,
			String dateOfBirth) {
		this.name = name;
		this.address = address;
		this.fathersName = fathersName;
		this.dateOfBirth = dateOfBirth;
	}

        /*
         * @Override is an annotation that tells 
         * compiler that the method mentioned below 
         * me is going to override the superclass method.
         */
	@Override
	public int setAadharNumber(int aadharNumber) {
		return this.aadharNumber = aadharNumber;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getFathersName() {
		return fathersName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public String toString() {
		return "Name: " + getName() + "\n" + "Father's Name: "
				+ getFathersName() + "\n" + "Address: " + getAddress() + "\n"
				+ "Date of Birth: " + getDateOfBirth();
	}
        
        public boolean isValid(String idNumber){
		System.out.println("The id is valid!");
		return true;
	}
}
