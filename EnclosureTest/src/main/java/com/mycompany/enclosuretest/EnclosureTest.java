/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.enclosuretest;

public class EnclosureTest {

    public static void main(String[] args) {
        
        Enclosure[] enclosures = new Enclosure[2];
        
        enclosures[0] = new Circle(5.0);
        enclosures[1] = new Square(10.0);
        
        for (int n = 0; n < enclosures.length; n++)
          System.out.println("area = " + enclosures[n].area() +", perimeter = " + enclosures[n].perimeter());
    }
}
