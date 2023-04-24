/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.binaryoutput;

/**
 *
 * @author User
 */
import java.io.*;

public class BinaryInput {

    public static void main(String[] args) {
       //set up file and stream
      File		 inFile	  = new File("sample1.data");
       
       try{
       ///set up file and stream

FileInputStream inStream = new FileInputStream(inFile);

//set up an array to read data in
int    fileSize  = (int)inFile.length();
byte[] byteArray = new byte[fileSize];

//read data in and display them
inStream.read(byteArray);
for (int i = 0; i < fileSize; i++) {
	System.out.println(byteArray[i]);
}

//input done, so close the stream
inStream.close();

       }
       
       catch (FileNotFoundException e){
       e.printStackTrace();
       }
       
       catch (IOException e){
           e.printStackTrace();
       }
       }
       }
