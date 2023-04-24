/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.enclosuretest;

/**
 *
 * @author User
 */
public interface Enclosure {
  public double perimeter();
  public double area();
}

class Circle implements Enclosure{
  double radius; //this.radius de radius
  Circle(double radius) { //radius on the right represents this radius
    this.radius = radius; 
  }
  
  public double perimeter(){
    return 2* Math.PI * this.radius;
  }
  
  public double area(){
  return Math.PI * (this.radius *  this.radius);
  }
 }

class Square implements Enclosure {
  double width;
  Square(double width) {
    this.width = width;
  }
  
  public double perimeter(){
    return 4* this.width;
  }
  
  public double area(){
  return this.width *  this.width;
  }
  
}

