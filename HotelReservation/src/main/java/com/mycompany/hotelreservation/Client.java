/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hotelreservation;
import java.util.Scanner;

public class Client {
     private String clientName;
    private String clientIC_Passport;
    private String clientPhoneNumber;
    private String email;
    
    //constructor
    public Client(){
    
    }
    public Client(String nm, String ic_passport,String phoneNum, String eml){
        clientName = nm;
        clientIC_Passport = ic_passport;
        clientPhoneNumber = phoneNum;
        email = eml;
    }
    
    //getter
    public String getName(){
        return clientName;
    }
    public String getIC_Passport(){
        return clientIC_Passport;
    }
    public String getPhoneNumber(){
        return clientPhoneNumber;
    }
    public String getEmail(){
        return email;
    }
    
    //setter
    public void setName(String nm){
        clientName = nm;
    }
    public void setIC_Passport(String ic_passport){
        clientIC_Passport = ic_passport;
    }
    public void setPhoneNumber(String phoneNum){
        clientPhoneNumber = phoneNum;
    }
    public void setEmail(String eml){
        email = eml;
    }
    
    public void addClient(){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Client Detail.");
        //taking input from user
        System.out.printf("%-42s: ","Enter your name of client");
        clientName = scan.next() + scan.nextLine();
        System.out.printf("%-42s: ","Enter your ic/passport number (without -)");
        clientIC_Passport = scan.next();
        System.out.printf("%-42s: ","Enter your phone number");
        clientPhoneNumber = scan.next();
        System.out.printf("%-42s: ","Enter your email");
        email = scan.next();
    }
    
    public void displayClientDetail(){
        System.out.printf("%-16s%-21s%-22s%-15s", clientName, 
                                                  clientIC_Passport,
                                                  clientPhoneNumber, 
                                                  email);
    }
    
    
    
    public void updateClientDetail(){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Update Client Info\n");
        System.out.print("Name correction: ");
        clientName = scan.next() + scan.nextLine();
        System.out.print("IC/Passport correction:");
        clientIC_Passport = scan.next();
        System.out.print("Phone Number correction: ");
        clientPhoneNumber = scan.next();
        System.out.print("Email correction: ");
        email = scan.next();
    }
    
    public void deleteClientDetail(){
        clientName = "";
        clientIC_Passport = "";
        clientPhoneNumber = "";
        email = "";
    }
}