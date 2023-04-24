/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ageinputmain;
import java.util.*;
public class AgeInputMain {

    public static void main(String[] args) {
        GregorianCalendar today;
     int age, thisYear, bornYr;
     String answer;
     Scanner scanner = new Scanner(System.in);
     AgeInputVer1 input = new AgeInputVer1() ; 
     try{
     age = input.getAge("How old are you? ");
    today    = new GregorianCalendar() ; 
    thisYear = today.get(Calendar.YEAR);
    bornYr   = thisYear - age;
    System.out.print("Already had your birthday this year? (Y or N)"); 
    answer = scanner.next();
    if (answer.equals("N") || answer.equals("n") ) { 
        bornYr--; 
    }
    System.out.println("\nYou are born in " + bornYr);
    }
     catch(InputMismatchException e){
            System.out.println("Invalid input! Please enter digit only.");
         }
  }
}
