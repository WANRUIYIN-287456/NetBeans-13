/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maxcomapp;

/**
 *
 * @author User
 */
import java.util.Scanner;

public class MaxcomApp {

  public static void main(String[] args) {
   int duration, category;
   Scanner read = new Scanner(System.in);
   double charge = 0.0;
   int respond;
   CallChargeCalculator ccc = new CallChargeCalculator();
   do {
     System.out.println("Enter the call duration (in minutes):");
     duration = read.nextInt();
    System.out.println("Enter Rate Category:  1.Daytime  2.Evening  3.Off-Peak");
    category = read.nextInt();
    charge = ccc.computeCharge(duration,category) ;
    System.out.printf("The amount you have to pay is = RM%.2f%n", charge);  //%.2f = 2 decimal. %n next line
    System.out.println("Do you want to continue? 1.Yes  2.No");
    respond = read.nextInt();
    System.out.println();
   } while (respond == 1);
   System.out.println("Thank you! See you again.");
 }
}
