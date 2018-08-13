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
public class DrivingLicense extends IdentityCard implements Expirable,one{
	public String name =null;
	public String address=null;
	public String fathersName = null;
	public String dateOfBirth =null; 
	public int typeOfVehicle = 0;
        public int expiryYear;
	public DrivingLicense(String name, String address, String fathersName,
			String dateOfBirth, int typeOfVehicle) {
		super(name, address, fathersName, dateOfBirth);
	}
        

        @Override
        public  void setExpiryYear(int expiryYear) {
                this.expiryYear = expiryYear;
        }

	@Override
	public boolean getExpiryStatus(int currentYear) {
            
		if(currentYear>expiryYear){
			System.out
                                .println("Your license is expired! Renew it within 6 months");
			return false;
		}else {
			System.out.println("Your license is not expired!");
			return true;
		}
	}
 
//        @Override
	public boolean isValid(String id, int lengthAllowed){
		if (id.length() != lengthAllowed) {
			System.out.println("Invalid Driving License Number!");
			return false;
		} else {
			System.out.println("The Driving License is Valid");
			return true;
		}
	}

    
	
}