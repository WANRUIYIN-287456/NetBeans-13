/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testprintwriter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TestBufferedReader {
      public static void main (String[] args) throws IOException {

	//set up file and stream
	File inFile = new File("sample3.data");
	FileReader fileReader = new FileReader(inFile);
	BufferedReader bufReader = new BufferedReader(fileReader);
	String str;

	str = bufReader.readLine();
	int i = Integer.parseInt(str);

        System.out.println(str);
        System.out.println(i);
	//similar process for other data types

        str = bufReader.readLine();
	System.out.println(str);
        
        str = bufReader.readLine();
	System.out.println(str);
        
	bufReader.close();
    }
}
