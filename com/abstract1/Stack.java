/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abstract1;

/**
 *
 * @author IDC-205
 */
public class Stack {
   private int maxSize;
   private Item[] stackArray;
   private int top;
 
   public Stack(int s) {
      //Assign s to the maxSize, declare the stack of array elements, initialize top
      this.maxSize=s;
      stackArray = new Item[s];
      this.top=0;
   }
   public void push(Item j) {
      //Push the whole operation item at the top of the stack
//       System.out.println("top:"+top);
      stackArray[top]=j;
      top=top+1;
    }
   public void displayOperationTop5() {
    //Print the last 5 (or  all elements if the size of stack is less than or equal to 5) operations in the following format:
    //'number1' 'operation' 'number2' = 'result'
    if (top<=5){
        for (int i = (stackArray.length-1); i>=0 ; i--) {
            if(stackArray[i]!=null){
            System.out.println(stackArray[i].getNumber1()+" "+stackArray[i].getOperation()+" "+stackArray[i].getNumber2()+" = "+stackArray[i].getResult());
        }
       }
    }else{
        int new_top=top;
        for (int i = (new_top-1); i >= (new_top-5); i--) {
            if(stackArray[i]!=null){
            System.out.println(stackArray[i].getNumber1()+" "+stackArray[i].getOperation()+" "+stackArray[i].getNumber2()+" = "+stackArray[i].getResult());
        }
    }
   }
   }
   public int peek() {
    //return the result of last operation. 
    //Hint: Top of the stack holds information for the last operation
     Item i =stackArray[(top-1)];
    return i.getResult();
   }
   public void add(int number1, int number2) {
	   //Print the result (e.g. If number1 is 2 and number2 is 3 then print 'Result: 5') and push the item into the stack
           Item i = new Item(number1, number2, (number1+number2), '+');
           System.out.println("Result: "+(number1+number2));
            push(i);
   }
   public void subtract(int number1, int number2) {
	   //Print the result (e.g. If number1 is 3 and number2 is 2 then print 'Result: 1') and push the item into the stack
           Item i = new Item(number1, number2, (number1-number2), '-');
           System.out.println("Result: "+(number1-number2));
            push(i);
   }
   public void multiply(int number1, int number2) {
	   //Print the result (e.g.  If number1 is 3 and number2 is 2 then print 'Result: 6') and push the item into the stack
           Item i = new Item(number1, number2, (number1*number2), '*');
           System.out.println("Result: "+(number1*number2));
            push(i);
   }
   public void divide(int number1, int number2) {
	   //Print the result (e.g. If number1 is 6 and number2 is 3 then print 'Result: 2') and push the item into the stack
           Item i = new Item(number1, number2, (number1/number2), '/');
           System.out.println("Result: "+(number1/number2));
           push(i);
   }
 
}
