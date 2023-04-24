/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exception;

/**
 *
 * @author User
 */
import java.util.*;
public class Exception {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int  num = 0;
        int err=0;
        try{
        System.out.print("Enter an integer : ");
        num = scan.nextInt();
        }
        catch(InputMismatchException e){
            System.out.println("Invalid input! Please enter digit only.");
            err=1;
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        if(err!=1)
        System.out.println("The number you entered is " +num);

    }
}
