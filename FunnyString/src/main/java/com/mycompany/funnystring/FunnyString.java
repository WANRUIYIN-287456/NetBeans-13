/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.funnystring;
import java.util.*;
/**
 *
 * @author User
 */
public class FunnyString {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
      
        String color, food, animal, first_name;
        System.out.print("Enter a favourite colour : ");
        color = scan.next();
        System.out.print("\nEnter a favourite food : ");
        food = scan.next();
        System.out.print("\nEnter a favourite animal : ");
        animal = scan.next();
        System.out.print("\nEnter first name of a friend : ");
        first_name = scan.next();
        
          System.out.println("I had a dream that "+ first_name +" ate a " + color + " " +
                  animal +" and said it tasted like " + food + " !");
        
        
        
    }
}
