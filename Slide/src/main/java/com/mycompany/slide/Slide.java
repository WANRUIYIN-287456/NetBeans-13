/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.slide;

/**
 *
 * @author User
 */
public class Slide {

    public static void main(String[] args) {
        String word1 = "How"; //String word1=new String ("How"); 
        String word2 = "are"; //String word2=new String ("are"); 
        String word3 = "you"; //String word3=new String ("you"); 
        String word4= word1 + word2 + word3;
        System.out.println("UPPERCASE: "+word1.toUpperCase());
        System.out.println("word4: "+word4+"?");
        System.out.println("length: "+word4.length()); 
        System.out.println("substring: "+word4.substring(3,9)); 
     }
}
