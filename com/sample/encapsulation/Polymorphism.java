/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample.encapsulation;

/**
 *
 * @author IDC-205
 */
class  Polymorphism extends Calculate
{
   @Override
   //Select the method name that appears here
    void compute(int num)
   {
      System.out.println("Square root of number is ="+Math.sqrt(num));
   }
}
