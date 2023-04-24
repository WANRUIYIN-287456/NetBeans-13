/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testbook;

import java.util.Scanner;

public class TestBook {

    static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n;
        String title;
        double price;
       System.out.print("Enter the number of books.");
       n = scan.nextInt();  
       
       Book myLibrary [] = new Book[n];
       
      for(int i =0; i < myLibrary.length; i++ ){
           System.out.print("Enter the name of the book : ");
           title = scan.next(); 
           System.out.print("Enter the price of the book: RM");
           price = scan.nextDouble(); 
           myLibrary[i] = new Book (title, price); 
      }
                  
       int maxi =0;
       double maxPrice=0;
       String maxTitle = null;
       
       for(int i =0; i < myLibrary.length; i++ ){
            
       if (maxPrice < myLibrary[i].getPrice()){
           maxi= i;
           maxPrice = myLibrary[i].getPrice();
           maxTitle = myLibrary[i].getTitle();
        }
       }   
          
        System.out.print("\nThe book with highest price in library is : " + maxTitle); 
        System.out.printf("\nPrice : " + "%.2f" ,maxPrice); 
        System.out.println("\nBook location in the array at " + maxi+1); 
        
        System.out.print("\nThe book title with term \"Java\" is : ");
        
        for(int i =0; i < myLibrary.length; i++ ){
         String s = "Java";   
         String jTitle= null;
        if ( myLibrary[i].getTitle().contains(s)){
           jTitle = myLibrary[i].getTitle();
           System.out.print(jTitle + " ");
        }
       }   
          
            
    }
    
}
