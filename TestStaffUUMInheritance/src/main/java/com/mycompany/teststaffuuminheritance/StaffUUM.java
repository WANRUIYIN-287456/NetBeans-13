/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.teststaffuuminheritance;

/**
 *
 * @author User
 */
public class StaffUUM {
    private String name;
    private String staffID;
    private String school;
    private double salary;
    
    /*public StaffUUM (String N, String ID, String Sc, double SY){
        N =name;
        ID = staffID;
        Sc = school;
        SY = salary;
    }
    */
    
    public void setName(String staffName){
        name = staffName;
    }
    
     public void setStaffID(String ID){
        staffID = ID;
    }
     
    public void setSchool(String schoolA){
        school = schoolA;
    }
    
    public void setSalary(double staffSalary){
        salary = staffSalary;
    }
    
    public String getName(){
        return name;
    }
    
    public String getStaffID(){
        return staffID;
    }
    
    public String getSchool(){
        return school;
    }
    
    public double getSalary(){
        return salary;
    }
}
