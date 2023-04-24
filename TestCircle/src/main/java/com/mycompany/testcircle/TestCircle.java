/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.testcircle;

/**
 *
 * @author User
 */
public class TestCircle {
// SLIDE CHAP 3
    public static void main(String[] args) {
        Circle circle1 = new Circle();
         
       
        System.out.println("Circle 1: Radius="+circle1.radius
                                     +"  Area= "+circle1.getArea());
         System.out.println("Number of Circle objects: "
                                       + Circle.numberOfObjects); 
         
        Circle circle2 = new Circle(2.5);
        System.out.println("Circle 2: Radius="+circle2.radius
                                     +"  Area= "+circle2.getArea());
         System.out.println("Number of Circle objects: "
                                       + Circle.numberOfObjects);
        System.out.println("Number of Circle objects: "                                            
                                      + Circle.getNumberOfObjects());
        
        Circle circle3 = new Circle(125); 
        System.out.println("Circle 3: Radius="+circle3.radius
                                     +"  Area= "+circle3.getArea()); 
        System.out.println("Number of Circle objects: "
                                       + Circle.numberOfObjects);
        System.out.println("Number of Circle objects: "                                            
                                      + Circle.getNumberOfObjects());
        
    }
}
    class Circle{
        double radius = 1.0;
        static int numberOfObjects;
       Circle() {
           numberOfObjects++;
       }
       Circle(double newRadius) {  
          radius = newRadius;
           numberOfObjects++;
}
       static int getNumberOfObjects(){
        return numberOfObjects;
    }

       double getArea(){
         return Math.pow(radius,2)*Math.PI;

}


}
