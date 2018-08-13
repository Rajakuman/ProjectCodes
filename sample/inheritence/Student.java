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
//order: name, admission number, class, percentage, pass result, route number and blood group.
public class Student {
    //Store name, ANo, STD
    String name;
    int ANo,std;
    public Student(String name,int ANo,int std){
        this.name=name;
        this.ANo=ANo;
        this.std=std;
    }
}
