/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstractclass;

public abstract class Shape {
   public abstract double calculateArea();
}

class Triangle extends Shape {
    private double height;
    private double base;
    
    public Triangle(double h, double b){
        height = h;
        base = b;
    }
    
    public double calculateArea() {
       return (height *base)/2.0;
    }
} //end Triangle

class Rectangle extends Shape {
    private double length;
    private double width;
    
    public Rectangle(double l, double w){
        length =l;
        width = w;
    }
    
    public double calculateArea() {
      return width * length;

    }
} //end Rectangle
