/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hotelreservation;
import java.util.*;

public class ReservationList {
    private List<Client> clientListA, clientListB, clientListC;
    private List<Room> roomA, roomB, roomC;
    private List<Reservation> reservationListA, reservationListB, reservationListC;
    
    public ReservationList(){
        clientListA = new ArrayList<Client>();
        clientListB = new ArrayList<Client>();
        clientListC = new ArrayList<Client>();
        roomA = new ArrayList<Room>();
        roomB = new ArrayList<Room>();
        roomC = new ArrayList<Room>();
        reservationListA = new ArrayList<Reservation>();
        reservationListB = new ArrayList<Reservation>();
        reservationListC = new ArrayList<Reservation>();
    }
    
    
    
    public void addReservation(Client newClient, Room newRoom, Reservation newReservation){
        if((newRoom.getRoomID().compareTo("100") >= 0)  &&  (newRoom.getRoomID().compareTo("200") < 0)){//ID of room A is [100,200) 
            int index = findIndex(newReservation.getReservationNumber());
            
            if(clientListA.isEmpty() && roomA.isEmpty() && reservationListA.isEmpty()){
                clientListA.add(newClient);
                roomA.add(newRoom);
                reservationListA.add(newReservation);
            }
            else{
                clientListA.add(index,newClient);
                roomA.add(index, newRoom);
                reservationListA.add(index, newReservation);
            }
            for(int i = 0; i < newReservation.getRoomQuantity() - 1; i++){
                clientListA.add(newClient);
                newRoom = new Room(newRoom.getRoomName(),
                                       Integer.toString(Room.roomNumA++),
                                       newRoom.getRoomPrice(),
                                       newRoom.getRoomDetail());
                roomA.add(newRoom);
                reservationListA.add(newReservation);
            }
        }//add in room A
        
        if((newRoom.getRoomID().compareTo("200") >= 0)  &&  (newRoom.getRoomID().compareTo("300") < 0)){
            int index = findIndex(newReservation.getReservationNumber());
            
            if(clientListB.isEmpty() && roomB.isEmpty() && reservationListB.isEmpty()){
                clientListB.add(newClient);
                roomB.add(newRoom);
                reservationListB.add(newReservation);
            }
            else{
                clientListB.add(index,newClient);
                roomB.add(index, newRoom);
                reservationListB.add(index, newReservation);
            }
            
            for(int i = 0; i < newReservation.getRoomQuantity() - 1; i++){
                clientListB.add(newClient);
                newRoom = new Room(newRoom.getRoomName(),
                                       Integer.toString(Room.roomNumB++),
                                       newRoom.getRoomPrice(),
                                       newRoom.getRoomDetail());
                roomB.add(newRoom);
                reservationListB.add(newReservation);
            }
        }//add in room B
        
        if((newRoom.getRoomID().compareTo("300") >= 0)  &&  (newRoom.getRoomID().compareTo("400") < 0)){
            int index = findIndex(newReservation.getReservationNumber());
            
            if(clientListC.isEmpty() && roomC.isEmpty() && reservationListC.isEmpty()){
                clientListC.add(newClient);
                roomC.add(newRoom);
                reservationListC.add(newReservation);
            }
            else{
                clientListC.add(index,newClient);
                roomC.add(index, newRoom);
                reservationListC.add(index, newReservation);
            }
            for(int i = 0; i < newReservation.getRoomQuantity() - 1; i++){
                clientListC.add(newClient);
                newRoom = new Room(newRoom.getRoomName(),
                                       Integer.toString(Room.roomNumC++),
                                       newRoom.getRoomPrice(),
                                       newRoom.getRoomDetail());
                roomC.add(newRoom);
                reservationListC.add(newReservation);
            }
        }//add in room C
    }//end addReservation method
    
    
    
    
    public void displayReservation(){
        System.out.printf("%-78s%-50s%-80s%n", "Client Information", 
                                               "Room Information", 
                                               "Reservation Information");
        System.out.printf("%-20s%-21s%-22s%-15s","Client's Name", 
                                                 "Client's IC/Passport",
                                                 "Client's Phone Number", 
                                                 "Client's Email");
        System.out.printf("%-10s%-8s%-12s%-20s","Room Name",//no need 
                                                "Room ID", 
                                                "Room Price",//no need 
                                                "Room Detail");//no need
        System.out.printf("%-20s%-15s%-15s%-15s%-15s%n","Special Request",
                                                        "Destination",
                                                        "Check in Date",
                                                        "Check out Date",
                                                        "Room Quantity");//add reservationNumber at front
        
        System.out.println("Room A");
        for(int i = 0; i < clientListA.size();i++){
            System.out.printf("%-2d. ",(i+1));
            
            clientListA.get(i).displayClientDetail();
            roomA.get(i).displayRoomInfo();
            reservationListA.get(i).displayReservationInfo();
            System.out.println();
        }
        
        System.out.println("Room B");
        for(int i = 0; i < clientListB.size();i++){
            System.out.printf("%-2d. ",(i+1));
            
            clientListB.get(i).displayClientDetail();
            roomB.get(i).displayRoomInfo();
            reservationListB.get(i).displayReservationInfo();
            System.out.println();
        }
        
        System.out.println("Room C");
        for(int i = 0; i < clientListC.size();i++){
            System.out.printf("%-2d. ",(i+1));
            
            clientListC.get(i).displayClientDetail();
            roomC.get(i).displayRoomInfo();
            reservationListC.get(i).displayReservationInfo();
            System.out.println();
        }
    }//end displayReservation
    
    
    public void updateReservation(int reservationNumber){//int or String
        int index = searchIndex(reservationNumber);//roomID change to reservationNumber
        
        if(reservationNumber >= 1000 && reservationNumber < 2000){
            clientListA.get(index).updateClientDetail();
            roomA.get(index).updateRoomInfo();
            reservationListA.get(index).updateReservationInfo();
        }
        if(reservationNumber >= 2000 && reservationNumber < 3000){
            clientListB.get(index).updateClientDetail();
            roomB.get(index).updateRoomInfo();
            reservationListB.get(index).updateReservationInfo();
        }
        if(reservationNumber >= 3000 && reservationNumber < 4000){
            clientListC.get(index).updateClientDetail();
            roomC.get(index).updateRoomInfo();
            reservationListC.get(index).updateReservationInfo();
        }
    }//end updateReservation
            
    public void deleteReservation(int reservationNumber){
        int index = searchIndex(reservationNumber);
        
        if(reservationNumber >= 1000 && reservationNumber < 2000){
            clientListA.get(index).deleteClientDetail();
            roomA.get(index).deleteRoomInfo();
            reservationListA.get(index).deleteReservationInfo();
        }
        
        if(reservationNumber >= 2000 && reservationNumber < 3000){
            clientListB.get(index).deleteClientDetail();
            roomB.get(index).deleteRoomInfo();
            reservationListB.get(index).deleteReservationInfo();
        }
        
        if(reservationNumber >= 3000 && reservationNumber < 4000){
            clientListC.get(index).deleteClientDetail();
            roomC.get(index).deleteRoomInfo();
            reservationListC.get(index).deleteReservationInfo();
        }
    }
    
    
    public int findIndex(int reservationNumber){
        int index;
        if(reservationNumber >= 1000 && reservationNumber < 2000){
            for(index = 0; index < reservationListA.size(); index++){
                if(reservationListA.get(index).getReservationNumber() > reservationNumber){
                    return index;
                }
            }
            return index;
        }//ROOM A
        if(reservationNumber >= 2000 && reservationNumber < 3000){
            for(index = 0; index < reservationListB.size(); index++){
                if(reservationListB.get(index).getReservationNumber() > reservationNumber){
                    return index;
                }
            }
            return index;
        }//ROOM B
        if(reservationNumber >= 3000 && reservationNumber < 4000){
            for(index = 0; index < reservationListC.size(); index++){
                if(reservationListC.get(index).getReservationNumber() > reservationNumber){
                    return index;
                }
            }
            return index;
        }//ROOM C
        
        return -1;//Index_Not_Found__ERROR
    }//end find Index
    
    public int searchIndex(int reservationNumber){
        int index;
        
        if(reservationNumber >= 1000 && reservationNumber < 2000){
            for(index = 0; index < reservationListA.size(); index++){
                if(reservationListA.get(index).getReservationNumber() == reservationNumber){
                    return index;
                }
            }
        }//ROOM A
        if(reservationNumber >= 2000 && reservationNumber < 3000){
            for(index = 0; index < reservationListB.size(); index++){
                if(reservationListB.get(index).getReservationNumber() == reservationNumber){
                    return index;
                }
            }
        }//ROOM B
        if(reservationNumber >= 3000 && reservationNumber < 4000){
            for(index = 0; index < reservationListC.size(); index++){
                if(reservationListC.get(index).getReservationNumber() == reservationNumber){
                    return index;
                }
            }
        }//ROOM C
        
        return -1;////Index_Not_Found__ERROR
    }
}