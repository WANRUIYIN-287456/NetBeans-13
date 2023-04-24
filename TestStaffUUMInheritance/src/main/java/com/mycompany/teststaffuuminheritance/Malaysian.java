/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.teststaffuuminheritance;

public class Malaysian extends StaffUUM{
    private String icNum;
    private String residentialStatus;
    private String name;
    private String staffID;
    private String school;
    private double salary;
    
   /* public Malaysian(String N, String ID, String Sc, double SY, String IC, String RC){
        //super(N, ID, Sc, SY);
        icNum = IC;
        residentialStatus = RC;
    }
    */
    public void seticNum(String IC){
        icNum = IC;
    }
    
     public void setresidentialStatus(String RC){
        residentialStatus = RC;
    }
    
     public String geticNum(){
        return icNum;
    }
    
     public String getresidentialStatus(){
        return residentialStatus;
    }
}
