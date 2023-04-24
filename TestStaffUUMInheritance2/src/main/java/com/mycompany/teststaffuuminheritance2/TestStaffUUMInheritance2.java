/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.teststaffuuminheritance2;

public class TestStaffUUMInheritance2 {

    public static void main(String[] args) {
        // TASK 2
        StaffUUM2 staffA = new StaffUUM2("Aminah","11900","SOC",6000);       
        Malaysian2 MsA = new Malaysian2("Khadijah", "11200","TISSA",4000.0,"760308-04-3800","Permanent Residence");
        International2 InterA = new International2("Suchitra","30000","SELCP", 10000.00,"F9888900","India");
             
        System.out.println("UUM STAFF\n");
        System.out.println("UUM Staff name is " + staffA.getName());
        System.out.println("UUM Staff Staff ID is " + staffA.getStaffID());
        System.out.println("UUM Staff School is " + staffA.getSchool());
        System.out.print("UUM Staff salary is RM ");
        System.out.printf("%.2f%n",staffA.getSalary());
        System.out.printf("%s%.2f%n","UUM Staff Bonus is RM ", staffA.calculateAllowance(10));
        System.out.println("\nMALAYSIAN UUM STAFF\n");
        System.out.println("MALAYSIAN UUM Staff name is " + MsA.getName());
        System.out.println("MALAYSIAN UUM Staff Staff ID is " + MsA.getStaffID());
        System.out.println("MALAYSIAN UUM Staff School is " + MsA.getSchool());
        System.out.print("MALAYSIAN UUM Staff salary is RM ");
        System.out.printf("%.2f%n", MsA.getSalary());
        System.out.println("Malaysian UUM Staff IC number is " + MsA.geticNum());
        System.out.println("Malaysian UUM Staff residential status is " + MsA.getresidentialStatus());
        System.out.printf("%s%.2f%n","Malaysian UUM Staff Bonus is RM " , MsA.calculateAllowance(10));
        System.out.println("\nInternational UUM STAFF\n");
        System.out.println("International UUM Staff name is " + InterA.getName());
        System.out.println("International UUM Staff Staff ID is " + InterA.getStaffID());
        System.out.println("International UUM Staff School is " + InterA.getSchool());
        System.out.print("International UUM Staff salary is RM ");
        System.out.printf("%.2f%n", InterA.getSalary());
        System.out.println("International UUM Staff passport number is " + InterA.getpassportNum());
        System.out.println("International UUM Staff origin country is " + InterA.getoriginCountry());
        System.out.printf("%s%.2f%n","International UUM Staff Bonus is RM ", InterA.calculateAllowance(10));
        
    }
}