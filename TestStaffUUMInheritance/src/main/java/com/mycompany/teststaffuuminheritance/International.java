/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.teststaffuuminheritance;

public class International extends StaffUUM{
   public String passportNum;
   public String originCountry;
    private String name;
    private String staffID;
    private String school;
    private double salary;
    
    /*public International(String N, String ID, String Sc, double SY, String P, String O){
        //super(N, ID, Sc, SY);

        passportNum = P;
        originCountry = O;
    }
    */
    
    public void setpassportNum(String P){
       passportNum = P;
    }
    
    public void setoriginCountry(String O){
        originCountry = O;
    }
    
    public String getpassportNum(){
       return passportNum;
    }
    
    public String getoriginCountry(){
        return originCountry;
    }
    
}
