/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upgrad.addressbook;

/**
 *
 * @author IDC-205
 */
import java.util.*;

public class AddressBook {
	List<Record> list;

	//declare 'list' as a linked list in the constructor using Java's built in API's 

    public AddressBook() {
        list = new LinkedList<Record>();
    }
        
	
public void add(String name, long number) {
	//Wrap all the details into an object of class Record and add it to the linked list
	// Print: 'Successfully added: contact_name', where contact_name is the name of the contact added
        Record r = new Record(name, number);
        list.add(r);
        System.out.println("Successfully added: "+name);
        
}
public void findByNumber(long number) {	
	//Check if the number exists
	// If it doesn't, print: 'No such Number exists'      
	//else Print: 'Name: contact_name', where contact_name is the name of the contact having that number	    
        int foundRecord=0;
        for (Record record : list) {
            if (record.getNumber()==(number)){
                foundRecord=1;
                System.out.println("Name: "+record.getName());
            }
        }
        if (foundRecord==0){
            System.out.println("No such Number exists");
        }
}

public void delete(long number) {
	//Check if the number exists
	// If it doesn't, print: 'No such Number exists'      
	//else delete the item in the linked list having the given number
	// Print: 'Successfully deleted: contact_number', where contact_number is the number to be deleted
        int foundRecord=0;
        for (int i = 0; i < list.size(); i++) {
        Record record = (Record)list.get(i);
        if (record.getNumber()==number){
                foundRecord=1;
                list.remove(i);
                System.out.println("Successfully deleted: "+record.getNumber());
            }
    }
        if (foundRecord==0){
            System.out.println("No such Number exists");
        }
}
public void printAddressBook() {
	System.out.println("List of contacts:"); 
	// Print the details of all the contacts in the list in the following format:
	//Name: ABC Number: 123456789
	//Note that the above is just an example	      
            for (Record record : list) {
                System.out.println("Name: "+record.getName()+" Number: "+record.getNumber());
            }
}
}
