/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.teststaff;
import java.util.Scanner;
public class TestStaff {
// EXE 3A USER DEFINED CLASS Q2B
    static Scanner console = new Scanner(System.in);	
    public static void main(String[] args) {
       String name, staff_id;
       int working_perday;
       
       System.out.print("Please enter name.");
       name = console.nextLine();
       System.out.print("Please enter staff id.");
       staff_id = console.nextLine();
       System.out.print("Please enter hours working per day.");
       working_perday = console.nextInt();
       
       Staff staffTS = new Staff();
       staffTS.setStaffInfo(name, staff_id, working_perday);
       staffTS.calculateSalary();
       System.out.print("\nName     : " + staffTS.getName());
       System.out.print("\nStaff id : " + staffTS.getStaffID());
       System.out.print("\nSalary   : " + staffTS.getSalary());
       
       
    }
}
    class Staff {
        private String name;
        private String staffID;
	private double salary;
	private int workingDay;
	public void setStaffInfo(String nm, String id, int wDay){
		name=nm;
            staffID=id;
            workingDay=wDay;
	}
	public void calculateSalary(){
		salary = workingDay * 35.0;
	}
	public double getSalary(){
		return salary;
	}
	public String getName(){
		return name;
	}
	public String getStaffID(){
		return staffID;
	}
    }

