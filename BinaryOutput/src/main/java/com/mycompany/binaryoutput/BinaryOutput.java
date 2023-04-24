/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.binaryoutput;

/**
 *
 * @author User
 */
import java.io.*;

public class BinaryOutput {

    public static void main(String[] args) {
       //set up file and stream
       File  outFile   = new File("sample1.data");
       
       try{
       FileOutputStream outStream = new FileOutputStream( outFile );

       //data to save
       byte[] byteArray = {10, 20, 30, 40, 
		     50, 60, 70, 80};

       //write data to the stream
       outStream.write( byteArray );

       //output done, so close the stream
       outStream.close();
       }
       
       catch (FileNotFoundException e){
       e.printStackTrace();
       }
       
       catch (IOException e){
           e.printStackTrace();
       }
       }
    }

