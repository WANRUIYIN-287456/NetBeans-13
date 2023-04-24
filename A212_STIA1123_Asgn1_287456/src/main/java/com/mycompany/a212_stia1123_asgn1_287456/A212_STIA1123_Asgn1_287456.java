package com.mycompany.a212_stia1123_asgn1_287456;
//WAN RUI YIN 287456

import java.util.Scanner;

public class A212_STIA1123_Asgn1_287456 {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
//A)DECLARATION AND INITIALIZATION OF VARIABLES AND INVOKING METHOD FROM DOOR CLASS
    int ch;
    int i;
    int num=0;
    int j;
    int w=0;
    int h=0;
    Door d1= new Door(w,h);
    

/*B)RECIEVE IN ARRAY FOR THE DETAILS OF DOORS
    -THE RANDOM NUMBER ABOUT THE DETAILS GENERATED ARE RESTRICTED IN A CERTAIN RANGE 
    -AN OBJECT ARRAY "DOOR" CREATED TO STORE THE DETAILS OF DOORS
*/
     while (num<1 || num>10) {
	System.out.print("Enter number of doors object that you want to create (1-10) : ");
	num = scan.nextInt();
    }
    
    Door [] door = new Door[num];
     
    for (i = 0; i < num; i++){
       door[i] = new Door(w,h);
       d1.setwidth(d1.RandomWidth());
       d1.setheight(d1.RandomHeight());
       w=d1.getwidth();
       h=d1.getheight();
       door[i] = new Door(w,h);
       System.out.print("Door " + i + " :");
       d1.ShowDoor();
    } 
    
//C) MENU CREATED FOR USER TO CHOOSE THE FUNCTION DISPLAY, EDIT OR EXIT PROGRAM USING CONTROL SELECTION STRUCTURE   
    System.out.println("MENU");    
    System.out.println("1. To display all the doors.");
    System.out.println("2. To edit the weight and height of selected door.");
    System.out.println("3. To exit the program.");
    ch = scan.nextInt(); 
    
    while (ch!=3){
    if(ch==1){
     for (i = 0; i < door.length; i++){
       System.out.print("Door " + i + " :");
       door[i].ShowDoor();
     }
     System.out.println("Do you wish to continue?"); 
    }
    else if (ch==2){
        d1.EditDoor();
        j=d1.getj();
        w=d1.getwidth();
        h=d1.getheight();
        //CONTINUE LOOPING WHILE THE INPUT NOT WITHIN THE RANGE
        while(j>num || w<80 || w>100 || h<170 || h>210){
        System.out.println("ERROR!");
        System.out.println("Please enter door number(0-"+ (num-1) +") width(80-100) and height(170-210).");
        d1.EditDoor();
        j=d1.getj();
        w=d1.getwidth();
        h=d1.getheight();
        }
        door[j].setwidth(w);
        door[j].setheight(h);
    
        System.out.println("Do you wish to continue?"); 
    }
    
    else{
        System.out.println("ERROR");
        System.out.println("Please enter integer 1-3."); 
    }
        
        System.out.println("MENU");    
        System.out.println("1. To display all the doors.");
        System.out.println("2. To edit the weight and height of selected door.");
        System.out.println("3. To exit the program.");
        ch = scan.nextInt();  
    }
    if (ch==3){
        System.out.println("Exit program.");
        System.out.println("Thank you!");   
    }
  }
 
}
