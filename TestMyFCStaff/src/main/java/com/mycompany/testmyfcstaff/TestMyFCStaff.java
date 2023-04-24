/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.testmyfcstaff;
import java.util.Scanner;
public class TestMyFCStaff {
 // EXE 3A USER DEFINED CLASS Q3
    static Scanner console = new Scanner(System.in);	
    public static void main(String[] args) {
       String name, staff_id;
       int total_hours;
       double total_sales;
       
       System.out.print("Please enter name.");
       name = console.nextLine();
       System.out.print("Please enter staff id.");
       staff_id = console.nextLine();
       System.out.print("Please enter total working hours.");
       total_hours = console.nextInt();
       System.out.print("Please enter total sales.");
       total_sales = console.nextDouble();
       
       MyFCStaff staffTS = new MyFCStaff(name, staff_id, total_hours, total_sales);       
       staffTS.calculateBasicWage();
       staffTS.calculateCommission();
       staffTS.calculateSalary();
       staffTS.displaySalary();
         
    }
}
    class MyFCStaff {
        private String name;
        private String staffID;
	private double salary;
	private int total_hours;
        private double total_sales;
        private double commission;
        private double basicWages;
        
	MyFCStaff(String nm, String id, int t_hours, double t_sales){
		name=nm;
                staffID=id;
                total_hours = t_hours;
                total_sales = t_sales;
	}
        public void calculateBasicWage(){
            basicWages = total_hours * 8.0;
        }
        public void calculateCommission(){
            if(total_sales<150)
                commission = 0;
            else if(total_sales >= 150 && total_sales <= 300)
                commission = total_sales * 0.05;
            else if(total_sales >= 301 && total_sales <= 500)
                commission = total_sales * 0.10;
            else if(total_sales >500)
                commission = total_sales * 0.15;
            
        }
	public void calculateSalary(){
		salary = basicWages + commission;
	}
        
	public void displaySalary(){
	    System.out.print("\nStaff Name   : " +  name);
            System.out.print("\nStaffID      : " + staffID);
            System.out.print("\nHours Work   : " + total_hours);
            System.out.printf("\nTotal Sale   : RM " + "%.2f",total_sales);
            System.out.printf("\nBasic Wage   :  RM " + "%.2f",basicWages);
            System.out.printf("\nCommission   : RM " + "%.2f",commission );
            System.out.printf("\nTotal Salary : RM " + "%.2f",salary);
            
	}
    }


