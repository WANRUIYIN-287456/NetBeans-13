/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ageinputmain2;

import java.util.*;

public class AgeInputVer2 {
    private static final String DEFAULT_MESSAGE = "Your age: ";
     private Scanner scanner;
     public AgeInputVer2(){ 
        scanner = new Scanner(System.in); 
     }
     
     public int getAge() throws Exception { 
        return getAge(DEFAULT_MESSAGE); 
    }
     
    public int getAge(String prompt) throws Exception{
    int age = 0; 
    boolean keepGoing = true;
    while (keepGoing){
    System.out.print(prompt);
    try {
     age = scanner.nextInt();
     if (age<0){
         throw new Exception ("Negative age is invalid.");
     }
     keepGoing = false;
    } catch (InputMismatchException e){
     scanner.next(); //remove the leftover garbage 
                     //from the input buffer
    System.out.println("Invalid Entry.Please enter digits only.");
   }
    catch (Exception e){
      System.out.println("Error :" + e.getMessage());
    }
  }
 return age;
}
}
