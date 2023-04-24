/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.teststaffuuminheritance2;

/**
 *
 * @author User
 */
public class TestPolymorphism {
    public static void main(String [] args){
        
     StaffUUM2 staffA = new StaffUUM2("Aminah","11900","SOC",6000); 
     StaffUUM2 StaffMAS = new Malaysian2("Khadijah", "11200","TISSA",4000.0,"760308-04-3800","Permanent Residence");
     StaffUUM2 StaffInter = new International2("Suchitra","30000","SELCP", 10000.00,"F9888900","India");
  
     //POLYMORPHISM : METHOD IN SUBCLASS BUT NOT IN SUPERCLASS, SUPERCLASS CANNOT GET IT
     //IF THERE IS A METHOD OF SAME NAME IN BOTH SUPER AND SUBCLASS, SUPERCLASS CAN ACCESS THROUGH POLYMORPHISM
     //HOWEVER BY USING DOWNCASTING, SUPERCLASS CAN ACCESS METHOD OF SUBCLASS ((CALLED SUBCLASS)SUBCLASS).SUBCLASS; METHOD
        System.out.println("UUM STAFF\n");
        System.out.println("UUM Staff name is " + staffA.getName());
        System.out.println("UUM Staff Staff ID is " + staffA.getStaffID());
        System.out.println("UUM Staff School is " + staffA.getSchool());
        System.out.print("UUM Staff salary is RM ");
        System.out.printf("%.2f%n",staffA.getSalary());
        System.out.printf("%s%.2f%n","UUM Staff Bonus is RM ", staffA.calculateAllowance(10));
        System.out.println("Method toString(): " + staffA.toString());
        
        System.out.println("\nMALAYSIAN UUM STAFF\n");
        System.out.println("MALAYSIAN UUM Staff name is " + StaffMAS.getName());
        System.out.println("MALAYSIAN UUM Staff Staff ID is " + StaffMAS.getStaffID());
        System.out.println("MALAYSIAN UUM Staff School is " + StaffMAS.getSchool());
        System.out.print("MALAYSIAN UUM Staff salary is RM ");
        System.out.printf("%.2f%n", StaffMAS.getSalary());
        //System.out.println("Malaysian UUM Staff IC number is " + StaffMAS.geticNum());
        //System.out.println("Malaysian UUM Staff residential status is " + StaffMAS.getresidentialStatus());
        System.out.println("Malaysian UUM Staff IC number is " + ((Malaysian2)StaffMAS).geticNum());
        System.out.println("Malaysian UUM Staff residential status is " + ((Malaysian2)StaffMAS).getresidentialStatus());
        System.out.printf("%s%.2f%n","Malaysian UUM Staff Bonus is RM " , StaffMAS.calculateAllowance(10));
        System.out.println("Method toString(): " + StaffMAS.toString());
        
        System.out.println("\nInternational UUM STAFF\n");
        System.out.println("International UUM Staff name is " + StaffInter.getName());
        System.out.println("International UUM Staff Staff ID is " + StaffInter.getStaffID());
        System.out.println("International UUM Staff School is " + StaffInter.getSchool());
        System.out.print("International UUM Staff salary is RM ");
        System.out.printf("%.2f%n", StaffInter.getSalary());
        //System.out.println("International UUM Staff passport number is " + StaffInter.getpassportNum());
        //System.out.println("International UUM Staff origin country is " + StaffInter.getoriginCountry());
        System.out.println("International UUM Staff passport number is " + ((International2)StaffInter).getpassportNum());
        System.out.println("International UUM Staff origin country is " + ((International2)StaffInter).getoriginCountry());
        System.out.printf("%s%.2f%n","International UUM Staff Bonus is RM ", StaffInter.calculateAllowance(10));
        System.out.println("Method toString(): " + StaffInter.toString()); //?
  }

}
