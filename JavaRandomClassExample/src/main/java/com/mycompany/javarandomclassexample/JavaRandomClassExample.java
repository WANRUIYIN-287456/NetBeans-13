/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.javarandomclassexample;

/**
 *
 * @author User
 */
import java.util.Random;
public class JavaRandomClassExample {

    public static void main(String[] args) {
       int numTests = 20; // run 20 random examples
       Random random = new Random();// create a new Java Random object
       for ( int i=0; i<numTests; i++ ){
          int randomInt = random.nextInt(100); // get the next random int
          System.out.print(randomInt +" ");
   }

    }
}
