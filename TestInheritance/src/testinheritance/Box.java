/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testinheritance;

/**
 *
 * @author User
 */
public class Box extends Rectangle{
    private double height;
     
    public Box(double L, double W, double H){
       super(L,W);
       height = H;
    }
         public double getHeight(){
       return height;
    }
    public double area() {
       return  2  * (getLength() * getWidth() + getLength() * height 
	+ getWidth() * height);
    } 
    public double volume() {
       return super.area() * height;
    }
    public String toString(){
       return super.toString () + "\nheight = " + height;
    }

}
