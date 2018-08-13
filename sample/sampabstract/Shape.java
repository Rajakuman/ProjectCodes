/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.sampabstract;

/**
 *
 * @author IDC-205
 */
abstract public class Shape {
    int x, y, z;
    
    public abstract  boolean isSimilar(Shape Object);
    public abstract  boolean isCongruent(Shape Object);
    public void position(int x_coordinate,int y_coordinate,int z_coordinate){
     this.x=x_coordinate;   
     this.y=y_coordinate;   
     this.z=z_coordinate;   
        System.out.println("The position is updated to ("+x+","+y+","+z+") ");
    }
    
}

 


//abstract​ ​class​ ​Shape​ {
//int​ x​,​ y​,​ z;
//public​ ​abstract​ ​boolean​ isSimilar​(​Shape​ ​object​);
//public​ ​abstract​ ​boolean​ isCongruent​(​Shape​ ​object​);
//public​ ​void​ position​(​int​ x_coordinate​,​ ​int​ y_coordinate​,​ ​int​ z_coordinate​)​ {
//this​.​x ​=​ x_coordinate;
//this​.​y ​=​ y_coordinate;
//this​.​z ​=​ z_coordinate;
//System​.​out​.​println​(​"The position is updated to ("​ ​+​ x ​+​ ​","​ ​+​ y ​+​ ​","​ ​+​ z ​+
//")"​);
//}
//}

