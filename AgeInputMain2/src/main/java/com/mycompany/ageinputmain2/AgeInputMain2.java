/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ageinputmain2;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class AgeInputMain2 {

    public static void main(String[] args) throws Exception{
       GregorianCalendar today;
     int age, thisYear, bornYr;
     String answer;
     Scanner scanner = new Scanner(System.in);
     AgeInputVer2 input = new AgeInputVer2() ; 
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
