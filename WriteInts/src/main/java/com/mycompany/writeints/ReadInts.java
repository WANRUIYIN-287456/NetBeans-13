/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.writeints;

import java.io.*;
class ReadInts
{
 public static void main ( String[] args ) 
 {
   String fileName = "intData.dat" ;  
   long sum = 0;

   try
   {      
     File file = new File(fileName);  
      DataInputStream instr = new DataInputStream(new FileInputStream(file));

     //read four integers and add them to sum 
     for(int i=0; i<4; i++){
         sum += instr.readInt();
     }
     
     
     //display sum of four integers
     System.out.println( "The sum is: " + sum );
     instr.close();
   }
   catch ( IOException iox )
   {
     System.out.println("Problem reading " + fileName );
   }
 }
}


