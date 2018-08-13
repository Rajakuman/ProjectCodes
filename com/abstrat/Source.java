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
public class Source {  
    public static void main(String[] args) {  
            ListOfBooks database = new ListOfBooks();
        database.add(234,"Hamlet","W. Shakespeare",27,29); 
        database.add(35,"Relativity","Albert Einstein",15,30);
        database.add(2,"Data Sciences","Shan B",1,4); 
        database.edit(2,"Data Sciences","Shan B",1,8);
        database.delete(35);
        database.printDatabase();
        database.add(120,"Crooked House","Agatha Christie",15,28);
        database.edit(235,"Hamlet","W. Shakespeare",28,29);
        database.add(121,"The final problem","Arthur Doyle",13,20);
        database.delete(234);
        database.printDatabase();     
    }  
}
