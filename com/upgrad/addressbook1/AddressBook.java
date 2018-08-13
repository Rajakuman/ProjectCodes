/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upgrad.addressbook1;
import java.lang.reflect.Array;
import java.util.*;


/**
 *
 * @author IDC-205
 */
public class AddressBook {
    	Record[] list;
	
	//declare 'list' as an array in the constructor, remember to declare a big enough array to store all possible IDs

    public AddressBook() {
    list = new Record[9999];
//    for(int i=0;i<list.length;++i){
//        list[i].ID=i;
//        } 
    }
    
        
	
public void add(String name, long number, int ID) {
	//Wrap all the details into an object of class Record and add it to the list at the correct index
	// Print: 'Successfully added: contact_name', where contact_name is the name of the contact added
        Record rec = new Record(name, number, ID);
        list[ID]=rec;
        System.out.println("Successfully added: "+name);
}
public void findByID(int ID) {
	//Check if the ID exists
	//If it doesn't, print: 'No such ID exists'      
	//else Print: 'Name: contact_name Number: contact_number', where contact_name and contact_number are the details of the contact having that ID
        Record rec = list[ID];
        if(rec==null){
            System.out.println("No such ID exists");
        }else{
            System.out.println("Name: "+rec.getName()+" Number: "+rec.getNumber());
        }
}

public void delete(int ID) {
	//Check if the ID exists
	//If it doesn't, print: 'No such ID exists'      
	//else delete the item in the list having the given ID
	//Print: 'Successfully deleted: contact_name', where contact_name is the name of the contact to be deleted
    Record rec = list[ID];
        if(rec==null){
            System.out.println("No such ID exists");
        }else{
            list[ID]=null;
            System.out.println("Successfully deleted: "+rec.getName());
        }

}
public void printAddressBook() {
	System.out.println("List of contacts:"); 
	// Print the details of all the contacts in the list in the following format:
	//Name: ABC ID: 876 Number: 123456789
	//Note that the above is just an example	      
for (int i = 0; i < list.length; i++) {
    if(list[i]!=null){
        System.out.println(list[i]);
//        System.out.println("Name: "+list[i].getName()+" ID: "+list[i].getID()+" Number: "+list[i].getNumber());
    }
    }
}

}
