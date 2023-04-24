/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testbook;

/**
 *
 * @author User
 */
public class Book {
    private String title;      //book’s title
    private double price;      //book’s price
    
 public Book(String t, double p) {
   title = t;
   price = p;
 }
 public String getTitle() {
   return title;
 }

 public double getPrice() {
   return price;
 }

}
