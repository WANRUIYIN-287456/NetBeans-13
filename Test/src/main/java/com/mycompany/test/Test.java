/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.test;

/**
 *
 * @author User
 */
public class Test {
// SLIDE CHAP 3
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("name? " + student.name); 
        System.out.println("age? " + student.age); 
        System.out.println("isScienceMajor? " + student.isScienceMajor); 
        System.out.println("gender? " + student.gender); 

    }
}
class Student {
  String name; // name has default value null
  int age; // age has default value 0
  boolean isScienceMajor; // isScienceMajor has default value false
  char gender; // c has default value '\u0000'
}
