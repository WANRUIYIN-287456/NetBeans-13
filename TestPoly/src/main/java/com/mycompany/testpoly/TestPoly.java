/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.testpoly;

public class TestPoly {

    public static void main(String [] args){
        X abc = new X();
        abc.printName();
   
        X def = new Y();
        def.printName();
        System.out.println(def.returnInt());
   
        X ghi = new Z();
        System.out.println(ghi.returnInt());
   
        ghi = new Y();
        ghi.printName();

        X [] arr = new X[2];
        arr[0] = new Y();
        arr[1] = new Z();
   
        for(int i=0;i<arr.length;i++)
        {
                System.out.println(arr[i].returnInt());
                if(arr[i] instanceof X)
                    System.out.println("Instance of X");
                if(arr[i] instanceof Y)
                    System.out.println("Instance of Y");
                if(arr[i] instanceof Z)
                    System.out.println("Instance of Z");
        }
    }
}//end of class TestPoly

class X{
    public void printName(){
        System.out.println("Name 1");
    }
    public int returnInt(){
        return 10;
    }
}//end of class X

class Y extends X{

    public void printName(){
        System.out.println("Name 2");
    }
   
    public int returnInt(){
        return 100;
    }
}//end of class Y

class Z extends X{
    @Override
    public void printName(){
        System.out.println("Name 3");
    }
    @Override
    public int returnInt(){
        return 200;
    }
}//end of class Z
