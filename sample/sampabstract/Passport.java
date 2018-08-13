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
public class Passport extends IdentityCard implements Expirable{
	public String country = null;
	public String placeOfIssue = null;
        public int expiryYear;

	public Passport(String name, String address, String fathersName,
			String dateOfBirth, String country, String placeOfIssue) {
		super(name, address, fathersName, dateOfBirth);
		this.country = country;
		this.placeOfIssue = placeOfIssue;
	}

	public String getCountry() {
		return this.country;
	}

	public String getPlaceOfIssue() {
		return this.placeOfIssue;
	}

        @Override
        public void setExpiryYear(int expiryYear) {
                this.expiryYear = expiryYear;
        }

	@Override
	public boolean getExpiryStatus(int currentYear) {
		if (currentYear > expiryYear){
			System.out
                                .println("Your passport is expired! Renew it within a week.");
			return false;
		} else {
			System.out.println("Your passport is not expired!");
			return true;
		}
	}
        
        @Override
	public boolean isValid(String id){
		if (id.length() != 9) {
			System.out.println("Invalid Passport number!");
			return false;
		} else {
			System.out.println("The Passport is Valid");
			return true;
		}
	}
	
}