/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abstrat;

import java.util.*;

/**
 *
 * @author IDC-205
 */
public class ListOfBooks {
    
    List<Book> list;

    public ListOfBooks() {
            list = new LinkedList<Book>();
    }
    
	//declare 'list' as a linked list in the constructor using Java's built in API's

public void add(int id, String name, String author, int issueDate, int returnDate) {
	//Wrap all the details into an object of class Book and add it to the linked list
	// Print: 'Successfully added: book_id', where book_id is the id of the book added
        Book bk = new Book(id, name, author, issueDate, returnDate);
        list.add(bk);
        System.out.println("Successfully added: "+id);
}

public void edit(int id, String name, String author, int issueDate, int returnDate) {
	//Check if the book ID exists
        // If it doesn't print: 'No such Book ID exists'      
	//else update the item in the linked list having the given Book ID
	// Print: 'Successfully edited: book_id', where book_id is the id of the book edited
    int updateRecord=0;
for (int i = 0; i < list.size(); i++) {
        Book bk = (Book)list.get(i);
        if(bk.getId()==id){
            updateRecord=1;
            list.remove(i);
            bk= new Book(id, name, author, issueDate, returnDate);
            list.add(bk);
        }
    }
        if (updateRecord==1){
            System.out.println("Successfully edited: "+id);
        }else if (updateRecord==0){
            System.out.println("No such Book ID exists");
        }        
}
public void delete(int id) {
	//Check if the book ID exists
// If it doesn't print: 'No such Book ID exists'      
	//else delete the item in the linked list having the given Book ID
	// Print: 'Successfully deleted: book_id', where book_id is the id of the book deleted
    int deleteRecord=0;
for (int i = 0; i < list.size(); i++) {
        Book b = (Book)list.get(i);
        if(b.getId()==id){
            deleteRecord=1;
            list.remove(i);
        }
    }
        if (deleteRecord==1){
            System.out.println("Successfully deleted: "+id);
        }else if (deleteRecord==0){
            System.out.println("No such Book ID exists");
        }
}
public void printDatabase() {
	System.out.println("List of books:");
// Print the details of all the books in the list in the following format:
//ID: 2, Name: ABC, Author: DEF, Date of Issue: 2, Date of Return: 3
//Note that the above is just an example
for (int i = 0; i < list.size(); i++) {
        Book b = (Book)list.get(i);
        System.out.println("ID: "+b.getId()+", Name: "+b.getName()+", Author: "+b.getAuthor()+", Date of Issue: "+b.getIssueDate()+", Date of Return: "+b.getReturnDate()+"");
    }
}
}
