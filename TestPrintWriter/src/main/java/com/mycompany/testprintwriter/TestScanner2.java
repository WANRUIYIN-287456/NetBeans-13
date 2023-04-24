/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testprintwriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class TestScanner2 {
public static void main(String[] args) throws IOException{
    //open the Scanner
	 File inFile = new File("sample3.data");
         String matricNo,name,grade;
         double mark;
         
        try{
        Scanner scanner = new Scanner(inFile);
        
        while (scanner.hasNextLine()) {  //check if there are more line
            String str = scanner.nextLine();
            Scanner scanner1 = new Scanner(str);
            scanner1.useDelimiter("\t");
        
        while (scanner1.hasNext()){
         matricNo=scanner1.next();
         name=scanner1.next();
         mark=scanner1.nextDouble();
         grade=scanner1.next();
         
         System.out.println(matricNo + " " + name + " " + mark + " " + grade + " ");
         
        }
      scanner1.close();
        }
        scanner.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
}	
}
