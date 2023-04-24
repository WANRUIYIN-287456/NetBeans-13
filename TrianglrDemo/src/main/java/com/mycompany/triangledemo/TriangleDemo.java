/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.triangledemo;

/**
 *
 * @author User
 */
import java.util.*;
//EXE 3B TASK2
public class TriangleDemo {

    public static void main(String[] args) {
       //create a Scanner object
      Scanner scanT2 = new Scanner(System.in);

      // Create a Triangle object.
      Triangle T2 = new Triangle();

      // Prompt user to input value for height and base 
        double height, base;
        System.out.println("Enter height of pyramid .");
        height = scanT2.nextDouble();
        System.out.println("Enter base of pyramid .");
        base = scanT2.nextDouble();
   
      //Set the height and base (use mutator) 
      T2.setHeight(height);
      T2.setBase(base);
     
      // Display the height, base and area (use accessor)
      System.out.println("The pyramid's height is "
                         + T2.getHeight());
      System.out.println("The pyramid's base is "
                         + T2.getHeight());
      
     System.out.println("The pyramid's area is "
                         + T2.getArea());

    }
    
}

