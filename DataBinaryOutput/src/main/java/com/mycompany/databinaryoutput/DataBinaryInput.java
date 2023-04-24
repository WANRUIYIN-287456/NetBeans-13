/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.databinaryoutput;
import java.io.*;

public class DataBinaryInput {
        public static void main (String[] args) throws IOException {
   
    	//set up inDataStream
        File inFile = new File("sampel2.data");
        FileInputStream inFileStream = new FileInputStream(inFile);
        DataInputStream inDataStream = new DataInputStream(inFileStream);
        
    	//read values back from the stream and display them
    	System.out.println(inDataStream.readInt());
    	System.out.println(inDataStream.readLong());
    	System.out.println(inDataStream.readFloat());
    	System.out.println(inDataStream.readDouble());
    	System.out.println(inDataStream.readChar());
    	System.out.println(inDataStream.readBoolean());

    	//input done, so close the stream
    	inDataStream.close();
    }

}
