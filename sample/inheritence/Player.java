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
public class Player {
//   int jerseyNumber=0;
//   String playerName=null;
//   int jerseyNumber(int jerseyNumber) {
//      return this.jerseyNumber = jerseyNumber;
//   }
//   String playerName(String name) {
//      return this.playerName = name;
//   }
    int jerseyNumber;
	String playerName;
	String playerTeam;
	int playerAge;
	private int playerAge(int age) {
		return this.playerAge = age;
	}
	int jerseyNumber(int jerseyNumber) {
		return this.jerseyNumber = jerseyNumber;
	}
	String playerName(String name) {
		return this.playerName = name;
	}
}
