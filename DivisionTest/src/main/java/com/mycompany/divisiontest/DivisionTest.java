/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.divisiontest;
import java.util.*;

public class DivisionTest{
     
 public static void main (String [] args) throws Exception{
 
  int num =0;
  int div=0;
  int result;
  int err=0;
  boolean keepGoing = true;
  Scanner input = new Scanner(System.in);
  
  while(keepGoing){
      try{
          System.out.print("Enter the numerator> ");        
          num = input.nextInt();
          System.out.print("Enter the divisor> ");        
          div = input.nextInt();
          if (div == 0){
              err=1;
              throw new Exception ("You can't divide by 0.");
          }
          keepGoing = false;
          err=0;
      }
      catch (InputMismatchException e){
          input.next();
          err=1;
          System.out.println("You entered bad data.\nPlease try again..");
      }
      catch (Exception e){
          System.out.println(e.getMessage());
      }
      if(err!=1){
          result = num/div;
          System.out.println (num +" / " +div+ " = " + result);
      }  
  }
 }
}
