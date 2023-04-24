/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.demobook;
public class Book {
     private String title;
    private int pgno;
    
    public Book(String t, int p){
        title =t;
        pgno = p;    
    }
    
    public String gettitle(){
        return title;
    }
    
    public int getpgno(){
        return pgno;
    }
    
     public String toString(){
        return title + " " + pgno;
    }
     
}
