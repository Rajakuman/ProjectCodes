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
public class Bus extends Student {
	//Store route and BG and also the attributes of student class(super keyword)
    int route;
    String bloodGroup;
    public Bus(String name,int ANo,int std,int route,String bloodGroup){
        super(name,ANo,std);
        this.route=route;
        this.bloodGroup=bloodGroup;
    }
}