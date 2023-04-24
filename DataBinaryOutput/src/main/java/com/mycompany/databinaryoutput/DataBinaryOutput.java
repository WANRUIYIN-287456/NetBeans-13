/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.databinaryoutput;
import java.io.*;

class DataBinaryOutput{
    public static void main (String[] args) throws IOException {

	//set up outDataStream
        File outFile = new File("sampel2.data");
        FileOutputStream outFileStream = new FileOutputStream(outFile);
        DataOutputStream outDataStream = new DataOutputStream(outFileStream);
        
	//write values of primitive data types to the stream
	outDataStream.writeInt(987654321);
	outDataStream.writeLong(11111111L);
	outDataStream.writeFloat(22222222F);
	outDataStream.writeDouble(3333333D);
	outDataStream.writeChar('A');
	outDataStream.writeBoolean(true);
	
	//output done, so close the stream
	outDataStream.close();
    }
}

