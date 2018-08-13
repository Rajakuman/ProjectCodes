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
public interface Expirable {
        public  void setExpiryYear(int expiryYear);
	public boolean getExpiryStatus(int currentYear);
}
