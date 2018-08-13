/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.inheritence;

/**
 *
 * @author IDC-205
 */
public class Cricketer extends Player {
//   public static void main(String[] args) {
//      Cricketer c = new Cricketer();
//      System.out.print(c.playerName("Dhoni") + " with jersey number "
//                        +c.jerseyNumber(7));
     
//   }
    public static void main(String[] args) {
		Cricketer c = new Cricketer();
		System.out.print(c.playerName("Dhoni") + " with jersey number "
 				+ c.jerseyNumber(7) + " is " 
                               + (38) +" years old.");
	}
}