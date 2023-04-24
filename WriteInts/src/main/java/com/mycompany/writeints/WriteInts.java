/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.writeints;
import java.io.*;
class WriteInts
{

 public static void main ( String[] args ) 
 {
   String fileName = "intData.dat";

   int value1   =   0, value2  = 1, 
       value3 = 255, value4 = -1;

   try
   {      
     File file = new File(fileName);
     FileOutputStream outFile = new FileOutputStream( file);
     DataOutputStream outData = new DataOutputStream(outFile);

     outData.writeInt(value1);
     outData.writeInt(value2);
     outData.writeInt(value3);
     outData.writeInt(value4);
     
     outData.close();
   }
   catch (IOException iox )
   {
     System.out.println("Problem writing " + fileName );
   }
 }
}
