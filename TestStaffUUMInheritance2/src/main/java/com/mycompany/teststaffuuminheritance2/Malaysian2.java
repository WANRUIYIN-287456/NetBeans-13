/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.teststaffuuminheritance2;
public class Malaysian2 extends StaffUUM2{
    private String icNum;
    private String residentialStatus;
    
   public Malaysian2(String N, String ID, String Sc, double SY, String IC, String RC){
        super(N, ID, Sc, SY);
        icNum = IC;
        residentialStatus = RC;
    }
/*    
    public void seticNum(String IC){
        icNum = IC;
    }
    
     public void setresidentialStatus(String RC){
        residentialStatus = RC;
    }
 */
       
     public String toString(){
        return "This is toString method in Malaysian class.";
     }
     
     public String geticNum(){
        return icNum;
    }
    
     public String getresidentialStatus(){
        return residentialStatus;
    }
     
     public double calculateAllowance(int noOfYear)
    {
        double bonus = noOfYear *200;
        bonus = bonus +500;
        return bonus;
    }
     
}
