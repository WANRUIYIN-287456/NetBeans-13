/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hotelreservation;
import java.util.Scanner;

public class HotelWorker {
    private String employeeName;
    private int employeeID;
    
    //constructor
    public HotelWorker(String employeeName,int employeeID){
        this.employeeName = employeeName;
        this.employeeID = employeeID;
    }
    
    //getter
    public String getEmployeeName(){
        return employeeName;
    }
    public int getEmployeeID(){
        return employeeID;
    }
    
    //setter
    public void setEmployeeName(String employeeName){
        this.employeeName = employeeName;
    }
    public void setEmployeeID(int employeeID){
        this.employeeID = employeeID;
    }
    
    public HotelWorker addHotelWorkerData(){
        Scanner scan  = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        employeeName = scan.next() + scan.nextLine();
        System.out.print("Enter your ID number: ");
        employeeID = scan.nextInt();
        
        HotelWorker hotelWorker = new HotelWorker(employeeName, employeeID);
        return hotelWorker;
    }
    
    public String displayHotelWorkerData(){
        return "Employee name\t: "+ employeeName +
               "Employee ID\t: "+ employeeID;
    }
    
    public void editHotelWorkerData(){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Update Hotel Worker Info\n");

        System.out.print("Employee Name correction : ");
        employeeName = scan.next() + scan.nextLine();
        System.out.print("Employee ID correction");
        employeeID = scan.nextInt();
    }
    
    public void deleteHotelWorkerData(){
        employeeName = "";
        employeeID = 0;
    }
}
