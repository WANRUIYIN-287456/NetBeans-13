/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.testcake;

/**
 *
 * @author User
 */
public class TestCake {
 public static void main(String[] args) {
        double highestPrice = 0;
        int i;
        int hiPriCake =0;
        double totalpriceRMCake = 0;
        double quantityRMCake = 0;
        Cake [] TestCake = new Cake [5];
                
        TestCake[0] = new orderCake ("Chcocolate", 50.0 , 1.5);
        TestCake[1] = new orderCake ("Vanilla", 60.0 , 2.5);
        TestCake[2] = new orderCake ("Red velvet", 50.0 , 1.8);
        TestCake[3] = new readymadeCake ("ChcocolateVanilla", 65 , 5);
        TestCake[4] = new readymadeCake ("VanillaVelvet", 50 , 3);
    
    
    for(i=0;i<TestCake.length;i++){
        System.out.printf("%s%.2f%n", "Cake " + (i+1) + ": price = RM " , TestCake[i].calPrice());
    }
    
    for(i=0;i<TestCake.length;i++){
        if (TestCake[i] instanceof readymadeCake){
        //System.out.println("Cake " + (i+1) + ": readymadeCake, price = RM " + TestCake[i].calPrice());
        totalpriceRMCake = totalpriceRMCake + TestCake[i].calPrice();
        quantityRMCake = quantityRMCake + ( TestCake[i].calPrice() / TestCake[i].rate );
        }
    }
        System.out.printf("%s%.2f%n", "Total Price for ready made cake : RM" , totalpriceRMCake);
        System.out.printf("%s%.2f%n", "Total Quantity for ready made cake : " , quantityRMCake);
        
    for(i=0;i<TestCake.length;i++)
        if (TestCake[i].calPrice()> highestPrice  ){
        highestPrice = TestCake[i].calPrice();
        hiPriCake = i;
        
    }
    System.out.print("Cake with highest price : Cake " + (hiPriCake + 1) + ", " + TestCake[hiPriCake].name + " cake, rate = RM " );
    System.out.printf("%.2f%s", TestCake[hiPriCake].rate ,", price = RM " + highestPrice);
    //cannot print two cakes with the same price?
  }
}
