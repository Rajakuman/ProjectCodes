/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upgrad.addressbook1;

/**
 *
 * @author IDC-205
 */
public class Record {
String name;  
long number; 
int ID;   

    public String getName() {
        return name;
    }

    public long getNumber() {
        return number;
    }

    public int getID() {
        return ID;
    }

    public Record(String name, long number, int ID) {
        this.name = name;
        this.number = number;
        this.ID = ID;
    
        

}
    @Override
    public String toString() {
//        return super.toString(); //To change body of generated methods, choose Tools | Templates.
        return ("Name: " + getName() + " ID: "+getID()+" Number: " + getNumber());
    }
}

