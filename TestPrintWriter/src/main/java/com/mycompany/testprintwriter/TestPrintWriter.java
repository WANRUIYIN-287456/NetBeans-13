/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.testprintwriter;
import java.io.*;
class TestPrintWriter {
    public static void main (String[] args) throws IOException {

	//set up file and stream
	File outFile = new File("sample3.data");
	FileWriter outFileStream 
			= new FileWriter(outFile);
	PrintWriter outStream = new PrintWriter(outFileStream);

	//write values of primitive data types to the stream
        outStream.println("287456 WAN 97 A");

	//outStream.println(987654321);
	//outStream.println("Hello, world.");
	//outStream.println(true);

	//output done, so close the stream
	outStream.close();
   }
}
