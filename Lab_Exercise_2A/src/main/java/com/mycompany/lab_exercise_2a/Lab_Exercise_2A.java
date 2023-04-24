/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab_exercise_2a;

import java.util.Scanner;

public class Lab_Exercise_2A {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        /*
        // QUESTION3
        String date, change;
        
        System.out.println("Please enter a date in DD/MM/YY format.");
         date = scan.nextLine();
        
        change = date.replaceAll("/",".");
        System.out.println(change);
        
        */
        
        // QUESTION4
        String year;
        
        System.out.println("Please enter a year.");
         year = scan.nextLine();
        
        char p = year.charAt(0);
        char q = year.charAt(1);
        char r = year.charAt(2);
        char s = year.charAt(3);
         System.out.println(p);
         System.out.println(q);
         System.out.println(r);
         System.out.println(s);
         
        String a = Character.toString(p);
        String b = Character.toString(q);
        String c = Character.toString(r);
        String d = Character.toString(s);
        
        
         int k = Integer.parseInt(a);
         int l = Integer.parseInt(b);
         int m = Integer.parseInt(c);
         int n = Integer.parseInt(d);
        
         int sum = k+l+m+n;
         System.out.println("Sum of digit of input year : " + sum);
         
    }
}
