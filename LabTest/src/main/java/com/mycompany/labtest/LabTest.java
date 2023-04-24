/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

//WAN RUI YIN 287456
package com.mycompany.labtest;

import java.util.Scanner;

public class LabTest {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int gameNumber;
       System.out.print("Enter an integer (1 to 20) = "); 
       gameNumber=scan.nextInt();
       System.out.println();
       GameNumber newgame = new GameNumber (gameNumber);
       newgame.evenOdd(gameNumber);
       System.out.println("The ten random numbers between " + gameNumber + " and 50 are: "); 
       for (int i=0; i<10; i++){
           System.out.print(newgame.RandomNumber() + " "); 
       }
    }
}
