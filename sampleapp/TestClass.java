/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sampleapp;

/**
 *
 * @author IDC-205
 */
public class TestClass {
	public static void main(String[] args) {
//		MathematicalOperations mathematicalOperations = new MathematicalOperations();
//		int sum = mathematicalOperations.addition(9,5);
//		System.out.println(sum);
                boolean condition = false;
if (condition = true && false) {
    System.out.println( "Condition is true.");
}else {
   System.out.println( "Condition is false.");
}
                TestClass tc = new TestClass();
//                System.out.println(tc.method());
tc.method(5);
	}

        public  void method(int day){
            if (day >= 1 && day <= 5) { 
  System.out.println("Time to wake up early. We have work today");
  if (day == 5) { 
    System.out.println("Don't forget to bring snacks for co-workers");
  }
}
else if (day == 6 || day == 7) { 
  System.out.println("Time to sleep in. No work today");
}
            System.out.println("------------------------");
             if (day >= 1 && day <= 5) {
            System.out.print("Time to wake up early. We have work today.");
            if (day == 5) {
                System.out.println("Don't forget to bring snacks for co-workers");
            }
        } 
        else if (day == 6 || day == 7) {
            System.out.println("Time to sleep in. No work today");
        }
            
            
        }
        public void method1(){
            int scores=0;
String nationality="Chinese";
boolean a = (scores>90);
boolean b = (nationality.equals("Indian"));
boolean c = scores>95;

if ((a && b) || (!b && c)) { 
    System.out.println("Admission Granted"); 
}else{
    System.out.println("Admission not Granted");
}
        }
        
public int method(){
    int num2 = -1000;
    int num1 = -1000;
    int [] input ={1,3,2,4,5,6};
            System.out.println("-------------------------");    
         for ( int i = 0; i < input.length ; i++) {
            System.out.println("input[i]"+input[i]);
            System.out.println("num1:"+num1);
            System.out.println("num2:"+num2);
            System.out.println("-------------------------");
             if( num1 < input[i] ){
                 num2 = num1;
                 num1 = input[i];
             } else if ( num2 < input[i]){
                  num2 = input[i];
             }
        }
    return num2;
}
//public int method ( ){
//  ​​​​​​​ ​​​​​​​ ​​​​​​​ ​​​​​​​ ​​​​​​​ ​​​​​​​int [] input = {1,3,2,4,5,6};
// ​​​​​​​      ​​​​​​​int num1 = -1000; int num2 = -1000;
//       for ( int i = 0; i < input.length ; i++) {
//             if( num1 < input[i] ){
//                 num2 = num1;
//                 num1 = input[i];
//             } else if ( num2 < input[i]){
//                  num2 = input[i];
//             }
//        }
// ​​​​​​​return num2;
//}
}

//public class MathematicalOperations {
//	private int addition(int number1, int number2){
//		return number2+number1;
//	}
//}
