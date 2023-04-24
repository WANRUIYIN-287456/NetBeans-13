/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.teststaffuuminheritance2;

public class International2 extends StaffUUM2{
   public String passportNum;
   public String originCountry;
     
    public International2(String N, String ID, String Sc, double SY, String P, String O){
        super(N, ID, Sc, SY);
        passportNum = P;
        originCountry = O;
    }
    
   /* public void setpassportNum(String P){
       passportNum = P;
    }
    
    public void setoriginCountry(String O){
        originCountry = O;
    }
  */
    
    public String toString(){
        return "This is toString method in International class.";
     }
    
    public String getpassportNum(){
       return passportNum;
    }
    
    public String getoriginCountry(){
        return originCountry;
    }
    
        public double calculateAllowance(int noOfYear)
    {
        double bonus = noOfYear *200;
        bonus = bonus +900;
        return bonus;
    }
        
}