/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.demobook;

public class Textbook extends Book{
    private String AuthorName;
    
    public Textbook(String t, int p, String a){
        super(t,p);
        AuthorName = a;  
    }
    
    public String getAuthorName(){
        return AuthorName;
    }
    
     public String toString(){
        return super.gettitle() + " " + super.getpgno() + " " + AuthorName;
    }
     
}

