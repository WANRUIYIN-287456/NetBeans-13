/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testprintwriter;
import java.io.*;

class ReadTextFile
{
 public static void main ( String[] args ) 
 {
   String fileName = "" ; //<=== put the name of your text file here
   String line;

   try
   {      
     BufferedReader in = new BufferedReader( new FileReader( fileName  ) );
     line = in.readLine();
     System.out.println( line );
     
     in.close();
   }
   catch ( IOException iox )
   {
     System.out.println("Problem reading " + fileName );
   }
 }
}
