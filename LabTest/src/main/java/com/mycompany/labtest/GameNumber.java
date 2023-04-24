/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

// WAN RUI YIN 287456
package com.mycompany.labtest;
import java.util.Random;

public class GameNumber {
    private int gamenumber;
    Random randomGenerator = new Random();
    
    public GameNumber(int gn){
        gamenumber = gn;
    }
    
     public void setGameNumber( int gn){
        gamenumber = gn;
    }
    
    public int getGameNumber(){
        return gamenumber;
    }
    
    public void evenOdd(int gamenumber){
        if (gamenumber % 2 ==0)
            System.out.println(gamenumber + " is even number.");
        else
            System.out.println(gamenumber + " is odd number.");
    }
    
    public int RandomNumber() {
      int randomnumber = randomGenerator.nextInt(51-gamenumber) + gamenumber;
      return randomnumber;
    }
}
