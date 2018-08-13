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
public class DriverClass {

//	public static void main(String[] args) {
//		System.out.println("------ Voter ID Details ------");
//		VoterID voterID = new VoterID("Vishesh Sharma", "Worli, Mumbai",
//				"Manoj Sharma", "18/11/1995","MZH23804312");
//		System.out.println(voterID.toString());
//		System.out.println("Serial Number: " + voterID.getSerialNumber());
//		System.out.println("Aadhar Card Number: " 
//                                + voterID.setAadharNumber(924121564));
//
//		Passport passport = new Passport("Pranav Verma", "Vasant Vihar, Delhi",
//				"Pragnesh Verma", "11/10/1989", "India", "Delhi");
//		System.out.println("------ Passport Details ------");
//		System.out.println(passport.toString());
//		System.out.println("Home Country: " + passport.getCountry());
//		System.out.println("Place of Issue: " + passport.getPlaceOfIssue());
//		System.out.println("Aadhar Card Number: " 
//                                + passport.setAadharNumber(123431564));
//	}

    	public static void main(String[] args) {
		System.out.println("------ Voter ID Details ------");
		VoterID voterID = new VoterID("Vishesh Sharma", "Worli, Mumbai",
				"Manoj Sharma", "18/11/1995", "MZH23804312");
		System.out.println(voterID.toString());
		System.out.println("Serial Number: " + voterID.getSerialNumber());
		System.out.println("Aadhar Card Number: "
				+ voterID.setAadharNumber(924121564));
                //Remaining code here
                voterID.isValid("RJT4MCG2WHEELER");
                
		Passport passport = new Passport("Pranav Verma", "Vasant Vihar, Delhi",
				"Pragnesh Verma", "11/10/1989", "India", "Delhi");
                passport.setExpiryYear(2016);
                passport.isValid("INDIA2014RAJASTHAN");

		System.out.println("------ Passport Details ------");
		System.out.println(passport.toString());
		System.out.println("Home Country: " + passport.getCountry());
		System.out.println("Place of Issue: " + passport.getPlaceOfIssue());
		System.out.println("Aadhar Card Number: "
				+ passport.setAadharNumber(123431564));
		passport.getExpiryStatus(2017);
		DrivingLicense dl = new DrivingLicense("Mahesh", "Dadar", "Ramesh",
				"14/12/1976", 2);
                dl.setExpiryYear(2016);
		dl.getExpiryStatus(2015);
                //Remaining code here
		System.out.println(passport.getExpiryStatus(2017));
		dl.isValid("UYT1234567890HG", 16);
	}
}