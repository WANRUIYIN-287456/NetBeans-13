/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hotelreservation;
import java.util.Scanner;

public class Reservation {
    private int reservationNumber;
    private String clientSpecialRequest;
    private String clientDestination;
    private String checkInDate;
    private String checkOutDate;
    private int roomQuantity;
    
    private static int reservationNumberA = 1000,
                       reservationNumberB = 2000,
                       reservationNumberC = 3000;
    
    public Reservation(){

    }
    
    //getter
    public int getReservationNumber(){
        return reservationNumber;
    }
    public String getSpecialRequest(){
        return clientSpecialRequest;
    }
    public String getDestination(){
        return clientDestination;
    }
    public String getCheckInDate(){
        return checkInDate;
    }
    public String getCheckOutDate(){
        return checkOutDate;
    }
    public int getRoomQuantity(){
        return roomQuantity;
    }
    
    //setter
    public void setReservationNumberA(int reservationNumber){
        this.reservationNumber = reservationNumber;
    }
    public void setSpecialRequest(String specialRequest){
        clientSpecialRequest = specialRequest;
    }
    public void setDestination(String destination){
        clientDestination = destination;
    }
    public void setCheckInDate(String checkInDate){
        this.checkInDate = checkInDate;
    }
    public void setCheckOutDate(String checkOutDate){
        this.checkOutDate = checkOutDate;
    }
    public void setRoomQuantity(int roomQuantity){
        this.roomQuantity = roomQuantity;
    }
    
    public void addReservationInfo(String roomID){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Reservation Info");
        System.out.printf("%-42s: ","Enter your special request");
        clientSpecialRequest = scan.next() + scan.nextLine();
        System.out.printf("%-42s: ","Enter your destination");
        clientDestination = scan.next();
        System.out.printf("%-42s: ","Enter the check in date (in dd/mm/yy)");
        checkInDate = scan.next();
        System.out.printf("%-42s: ","Enter the check out date (in dd/mm/yy)");
        checkOutDate = scan.next();
        System.out.printf("%-42s: ","Enter the number of rooms booked");
        roomQuantity = scan.nextInt();
        
        if(roomID.compareTo("100") >= 0 && roomID.compareTo("200") < 0)
            reservationNumber = reservationNumberA++;
        if(roomID.compareTo("200") >= 0 && roomID.compareTo("300") < 0)
            reservationNumber = reservationNumberB++;
        if(roomID.compareTo("300") >= 0 && roomID.compareTo("400") < 0)
            reservationNumber = reservationNumberC++;
    }//end reservation method
    
    public void displayReservationInfo(){
        System.out.printf("%-20s%-15s%-15s%-15s%-15d", clientSpecialRequest,
                                                       clientDestination,
                                                       checkInDate,
                                                       checkOutDate,
                                                       roomQuantity);
    }
    
    public void updateReservationInfo(){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Update Reservation Info\n");
        
        System.out.print("Client Special Request correction: ");
        clientSpecialRequest = scan.next() + scan.nextLine();
        System.out.print("Destination correction : ");
        clientDestination = scan.next() + scan.nextLine();
        System.out.print("Check in Date correction : ");
        checkInDate = scan.next();
        System.out.print("Check out Date correction : ");
        checkOutDate = scan.next();
        System.out.print("Number of rooms booked correction : ");
        roomQuantity = scan.nextInt();
    }
    
    public void deleteReservationInfo(){
        reservationNumberA = 0;
        reservationNumberB = 0;
        reservationNumberC = 0;
        clientSpecialRequest = "";
        clientDestination = "";
        checkInDate = "";
        checkOutDate = "";
        roomQuantity = 0;
    }
}