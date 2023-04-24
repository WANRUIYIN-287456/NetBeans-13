/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testinheritance;
public class Rectangle {
   private double length;
   private double width;
     
   public Rectangle(double L, double W)  {
       length = L;
       width = W;
   }
   public double getLength() {
       return length;
   }
   public double getWidth() {
       return width;
   }
   public double area() {
       return length * width;
   }
   public String toString() {
     return ("length = " + length + "\n" + "width = " + width);
   }

} // end for Rectangle class
   
