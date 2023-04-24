/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hotelreservation;
import java.util.Scanner;

public class Room {
    private String roomName;
    private String roomID;
    private double roomPrice;
    private String roomDetail;
        
    static int roomNumA = 100,
               roomNumB = 200,
               roomNumC = 300;
    
    //trace roomID using queue
    static int frontIndexA = 0, backIndexA = -1,
               frontIndexB = 0, backIndexB = -1,
               frontIndexC = 0, backIndexC = -1;
    static String[] roomFrontA = new String[50],
                    roomFrontB = new String[30],
                    roomFrontC = new String[20];
    
    //constructor
    public Room(){
        
    }
    public Room(String roomName, String roomID, double roomPrice, String roomDetail){
        this.roomName = roomName;
        this.roomID = roomID;
        this.roomPrice = roomPrice;
        this.roomDetail = roomDetail;
    }
    //getter
    public String getRoomName(){
        return roomName;
    }
    public String getRoomID(){
        return roomID;
    }
    public double getRoomPrice(){
        return roomPrice;
    }
    public String getRoomDetail(){
        return roomDetail;
    }
    
    //setter
    public void setRoomName(String roomName){
        this.roomName = roomName;
    }
    public void setRoomID(String roomID){
        this.roomID = roomID;
    }
    public void setRoomPrice(double roomPrice){
        this.roomPrice = roomPrice;
    }
    public void setRoomDetail(String roomDetail){
        this.roomDetail = roomDetail;
    }
    
    public void addRoomInfo(){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Room Info.");
        System.out.printf("%-42s: ","Enter the room name(A/B/C)");
        roomName = scan.next().toUpperCase();
        
        while(roomName.charAt(0) != 'A' && roomName.charAt(0) != 'B' && roomName.charAt(0) != 'C'){
            System.out.printf("%-42s: ","Please enter again the room name (A/B/C)");
            roomName = scan.next().toUpperCase();
        }
        
        if(roomName.charAt(0) == 'A'){
            if(roomFrontA[frontIndexA] == null){
                roomID = Integer.toString(roomNumA++);
            }
            else{
                roomID = roomFrontA[frontIndexA];
                roomFrontA[frontIndexA] = null;
                frontIndexA = ((frontIndexA + 1) %  roomFrontA.length);
            }
                
            roomPrice = 199;
            roomDetail = "Detail of A";
        }
        if(roomName.charAt(0) == 'B'){
            if(roomFrontB[frontIndexB] == null){
                roomID = Integer.toString(roomNumB++);
            }
            else{
                roomID = roomFrontB[frontIndexB];
                roomFrontB[frontIndexB] = null;
                frontIndexB = ((frontIndexB + 1) %  roomFrontB.length);

            }
            roomPrice = 299;
            roomDetail = "Detail of B";
        }
        if(roomName.charAt(0) == 'C'){
            if(roomFrontC[frontIndexC] == null){
                roomID = Integer.toString(roomNumC++);
            }
            else{
                roomID = roomFrontC[frontIndexC];
                roomFrontC[frontIndexC] = null;
                frontIndexC = ((frontIndexC + 1) %  roomFrontC.length);
            }
            roomPrice = 399;
            roomDetail = "Detail of C";
        }
    }//end addRoom method
    
    public void displayRoomInfo(){
        System.out.printf("%-10s%-8s%-12.2f%-20s",roomName, 
                                                  roomID, 
                                                  roomPrice, 
                                                  roomDetail);
    }
    
    public void updateRoomInfo(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Update Room Info: \n");

        if(roomName.equals("A")){
            roomNumA--;
        }
        if(roomName.equals("B")){
            roomNumB--;
        }
        if(roomName.equals("C")){
            roomNumC--;
        }
        
        System.out.print("Room Name correction : ");
        roomName = scan.next();
        
        if(roomName.equals("A")){
            roomID = Integer.toString(roomNumA++);
            roomPrice = 199;
            roomDetail = "Detail of Room A.";
        }
        if(roomName.equals("B")){
            roomID = Integer.toString(roomNumB++);
            roomPrice = 299;
            roomDetail = "Detail of Room B.";
        }
        if(roomName.equals("C")){
            roomID = Integer.toString(roomNumC++);
            roomPrice = 399;
            roomDetail = "Detail of Room C.";
        }
    }//end editRoom method
    
    public void deleteRoomInfo(){
        
        if(roomName.equals("A")){
            roomFrontA[backIndexA] = roomID;//add the roomID to roomFront array to store that num
            backIndexA = (backIndexA + 1) % roomFrontA.length;
        }
        if(roomName.equals("B")){
            roomFrontB[backIndexB] = roomID;
            backIndexB = (backIndexB + 1) % roomFrontB.length;
        }
        if(roomName.equals("C")){
            roomFrontC[backIndexC++] = roomID;
            backIndexC = (backIndexC + 1) % roomFrontC.length;
        }        
        roomName = null;
	roomID = null;
	roomPrice = 0;
	roomDetail = null;
    }
}
