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
//name, admission number, class, percentage, pass result, route number and blood group.
public class Report extends Student{
    	//Store ptage and pass and also the attributes of student class(super keyword)
    int ptage;
    String pass;
    public Report(String name,int ANo,int std,int ptage,String pass){
        super(name,ANo,std);
        this.pass=pass;
        this.ptage=ptage;
    }
    

}
