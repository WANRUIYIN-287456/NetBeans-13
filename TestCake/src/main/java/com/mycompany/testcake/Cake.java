/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testcake;

public abstract class Cake {
   protected String name;
   protected double rate;
   
   public Cake(String n, double r){
       name=n;
       rate=r;
   }
   
   public abstract double calPrice();
   
   public String toString(){
       return name + "\t" + rate;
   }
}

class orderCake extends Cake{
    private double weight;
    
    public orderCake(String n, double r,double w){
        super(n,r);
        weight = w;
    }
    
    public double calPrice(){
        return rate * weight;
    }
}

class readymadeCake extends Cake{
    private double quantity;
    
    public readymadeCake(String n, double r,double q){
        super(n,r);
        quantity =q;
    }
    
    public double calPrice(){
        return rate * quantity;
    }
}
