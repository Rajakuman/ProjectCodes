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
public class VoterID extends IdentityCard{
private String serialNumber=null;
//    VoterID voterID = new VoterID("Vishesh Sharma", "Worli, Mumbai",
//				"Manoj Sharma", "18/11/1995","MZH23804312");    
    public VoterID(String name, String address, String fathersName, String dateOfBirth,String serialNumber ){
        super(name,address,fathersName,dateOfBirth);
        this.serialNumber=serialNumber;
}

    /**
     * @return the serialNumber
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * @param serialNumber the serialNumber to set
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    
    @Override
    public boolean isValid(String id){
            if (id.length() != 10) {
                    System.out.println("Invalid Voter ID number!");
                    return false;
            } else {
                    System.out.println("The Voter ID is Valid");
                    return true;
            }
    }
}