/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abstrat;

/**
 *
 * @author IDC-205
 */
public class Book {
int id;  
String name,author;  
int issueDate, returnDate; 

    public Book(int id, String name, String author, int issueDate, int returnDate) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.issueDate = issueDate;
        this.returnDate = returnDate;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getIssueDate() {
        return issueDate;
    }

    public int getReturnDate() {
        return returnDate;
    }

}
