/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.teststaffuuminheritance2;

public class StaffUUM2 {
    private String name;
    private String staffID;
    private String school;
    private double salary;
    
    public StaffUUM2 (String N, String ID, String Sc, double SY){
        name =N;
        staffID =ID;
        school =Sc;
        salary =SY;
    }
    
    public String toString(){
        return "This is toString method in StaffUUM class.";
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
    
    public double calculateAllowance(int noOfYear)
    {
        double bonus = noOfYear *200;
        return bonus;
    }

}
