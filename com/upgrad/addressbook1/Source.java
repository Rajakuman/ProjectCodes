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
public class Source {
    
public static void main(String[] args) {  
    AddressBook myContacts = new AddressBook();
    myContacts.add("John", 9876123450l, 101);
    myContacts.add("Mellisa", 8360789114l, 560);
    myContacts.add("Daman",9494149900l, 444);
    myContacts.findByID(999);
    myContacts.printAddressBook();
    myContacts.delete(101);
    myContacts.add("Gregory",7289880988l, 980);
    myContacts.printAddressBook();
    myContacts.findByID(560);
    myContacts.add("Mary",7205678901l, 670);
    myContacts.delete(101);
    myContacts.findByID(670);
    myContacts.printAddressBook();      
}  
}

//Successfully added: John
//Successfully added: Mellisa
//Successfully added: Daman
//No such ID exists
//List of contacts:
//Name: John ID: 101 Number: 9876123450
//Name: Daman ID: 444 Number: 9494149900
//Name: Mellisa ID: 560 Number: 8360789114
//Successfully deleted: John
//Successfully added: Gregory
//List of contacts:
//Name: Daman ID: 444 Number: 9494149900
//Name: Mellisa ID: 560 Number: 8360789114
//Name: Gregory ID: 980 Number: 7289880988
//Name: Mellisa Number: 8360789114
//Successfully added: Mary
//No such ID exists
//Name: Mary Number: 7205678901
//List of contacts:
//Name: Daman ID: 444 Number: 9494149900
//Name: Mellisa ID: 560 Number: 8360789114
//Name: Mary ID: 670 Number: 7205678901
//Name: Gregory ID: 980 Number: 7289880988

