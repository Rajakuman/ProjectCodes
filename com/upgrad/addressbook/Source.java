/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upgrad.addressbook;

/**
 *
 * @author IDC-205
 * ADT: unsorted list
 * Description
 * Design a simple address book with the basic functionalities of adding a contact, deleting a contact, 
* finding a contact by the number and printing the list of existing contacts. Implement this using the 
* dictionary ADT with the key as the phone number. Use a linked list to store all the contacts in the order in 
* which they were added. The information in each record of the list is:
* Phone Number
* Name
* 
* So the linked list has objects of class Record. Complete the functions of the AddressBook class as mentioned in the comments.
* Do not change the Source class code. The printing should be exactly as per the instructions given, including spacing.
* (No input needed)
* 
* 
* Execution Time Limit 5 seconds
 */
public class Source {
    
public static void main(String[] args) {  
	AddressBook myContacts = new AddressBook();
    myContacts.add("John", 9876123450l);
    myContacts.add("Mellisa", 8360789114l);
    myContacts.add("Daman",9494149900l);
    myContacts.findByNumber(9998760333l);
    myContacts.printAddressBook();
    myContacts.delete(9876123450l);
    myContacts.add("Gregory",7289880988l);
    myContacts.printAddressBook();
    myContacts.findByNumber(8360789114l);
    myContacts.add("Mary",7205678901l);
    myContacts.delete(9876123450l);
    myContacts.findByNumber(7205678901l);
    myContacts.printAddressBook();      
}  
}
