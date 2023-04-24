/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.demobook;

public class DemoBook {
// EXE 4B INHERITANCE TASK 1
   public static void main ( String args[] )
  {
      Book book1 = new Book("Programming 2", 120);
      Textbook TB1 = new Textbook("Intro Programming", 1122, "Juliana");
      
      System.out.println(book1);
      System.out.println("Title \t\t :" + book1.gettitle());
      System.out.println("Page number \t :" + book1.getpgno());
      System.out.println(TB1.toString());
      System.out.println("Title \t\t :" + TB1.gettitle());
      System.out.println("Page number \t :" + TB1.getpgno());
      System.out.println("Author name \t :" + TB1.getAuthorName());
  }
}
