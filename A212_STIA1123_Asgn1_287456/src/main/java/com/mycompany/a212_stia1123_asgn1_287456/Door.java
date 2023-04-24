
package com.mycompany.a212_stia1123_asgn1_287456;
//WAN RUI YIN 287456

import java.util.Scanner;
import java.util.Random;

public class Door {
    Scanner scan = new Scanner(System.in);
    private int width;
    private int height;
    private int j;
    Random randomGenerator = new Random();
 
//CONSTRUCTOR
    public Door (int w, int h){
        width = w;
        height = h;
    }
 
//CLASS SHOWDOOR
    public void ShowDoor(){
      System.out.print("width = "+ width + " height = " + height + "\n");  
    }

//CLASS EDITDOOR    
    public void EditDoor(){
        System.out.print("Enter door number to edit:"); 
        j=scan.nextInt();
        System.out.print("Enter new width of door number "+ j + "  :"); 
        width=scan.nextInt();
        System.out.print("Enter new height of door number "+ j + " :"); 
        height=scan.nextInt();
    }

//METHODS TO GET RANDOM WITH AND HEIGHT    
    public int RandomWidth() {
      int randomWidth = randomGenerator.nextInt(21) + 80;
      return randomWidth;
    }
     
    public int RandomHeight() {
      int randomHeight = randomGenerator.nextInt(41) + 170;
      return randomHeight;
    }
 
//ACCESSORS AND MUTATORS
    public void setwidth( int w){
        width =w;
    }
    
    public void setheight( int h){
        height = h;
    }
    
    public int getwidth(){
        return width;
    }
    
    public int getheight(){
        return height;
    }
    
    public int getj(){
        return j;
    }
}
