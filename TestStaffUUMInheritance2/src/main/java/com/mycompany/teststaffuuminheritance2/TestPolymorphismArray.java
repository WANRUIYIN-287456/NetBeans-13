/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.teststaffuuminheritance2;

/**
 *
 * @author User
 */
public class TestPolymorphismArray {
     public static void main(String[] args) {
      int totalMAS=0, totalInter=0;
         
   //create array of object for StaffUUM, size: 10. 
    StaffUUM2 Stafflist [] = new StaffUUM2 [5]; //IF USE 10, ERROR BECAUSE JUST INITIALIZE 5 OBJECT
    
   //create and assign 5 objects into the array. Use multiple objects (Malaysian and International)
     Stafflist[0] = new Malaysian2("Khadijah", "11200","TISSA",4000.0,"760308-04-3800","Permanent Residence");
     Stafflist[1] = new Malaysian2("Amira", "11300","SOC",4500.0,"760308-01-3800","Permanent Residence"); 
     Stafflist[2] = new Malaysian2("Amir", "11400","SCIMPA",4400.0,"760506-01-3800","Permanent Residence");
     Stafflist[3] = new International2("Suchitra","30000","SELCP", 10000.00,"F9888900","India");
     Stafflist[4] = new International2("David", "35000","SOC",11000.0,"F9885900","UK");
     
   //use for loop to call method toString() and calculateAllowance(int noOfYear). 
   //Assume all staff has been working for 10 years 
   for(int i=0;i<Stafflist.length;i++){
       System.out.println("Method toString(): " + Stafflist[i].toString());
       System.out.printf("%s%.2f%n%n","UUM Staff Bonus is RM ", Stafflist[i].calculateAllowance(10));
   }
   
      for(int i=0;i<Stafflist.length;i++){
       if (Stafflist[i] instanceof Malaysian2){
           totalMAS++;
       }
       else if (Stafflist[i] instanceof International2){
           totalInter++;
       }
      }
 
      System.out.println("Number of Malaysian Staff :" + totalMAS);
      System.out.println("Number of International Staff :" + totalInter);
}
}