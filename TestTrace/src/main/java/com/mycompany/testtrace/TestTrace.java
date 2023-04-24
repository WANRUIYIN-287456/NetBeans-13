/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.testtrace;
class CallEg {
    
  public void methodA() throws Exception {
      //throw new Exception ("Method A exception."); //TASK2Q1
    try{
      methodB();
    }
    catch(Exception e){
        e.printStackTrace();
    }
  }

  public void methodB() throws Exception {
    try{
      methodC();
    }
    catch(Exception e){
        e.printStackTrace();
    }
  }

  public void methodC() throws Exception {
      throw new Exception ("Method A exception.");
  }

}

public class TestTrace {
  public static void main ( String[] args ) throws Exception {
    CallEg eg = new CallEg();   // use default constructor
    try {
      eg.methodA();
    }
    catch ( Exception oops ) {
       oops.printStackTrace();
    }
  }
}
