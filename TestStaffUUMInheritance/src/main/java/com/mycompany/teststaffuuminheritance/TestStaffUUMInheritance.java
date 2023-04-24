/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.teststaffuuminheritance;

/**
 *
 * @author User
 */
public class TestStaffUUMInheritance {

    public static void main(String[] args) {
        // question c(i)
        StaffUUM staffA = new StaffUUM();
        Malaysian MsA = new Malaysian();
        International InterA = new International();
        //CONSTRUCTOR NO-ARG, NO PARAMETERS INSIDE ()
        
        staffA.setName("Sharifah");
        staffA.setStaffID("1199");
        staffA.setSchool("SOC");
        staffA.setSalary(3000);
        MsA.setName("Syed");
        MsA.setStaffID("1169");
        MsA.setSchool("SBM");
        MsA.setSalary(6000);
        MsA.seticNum("630818-02-5261");
        MsA.setresidentialStatus("Citizen");
        InterA.setName("Jason");
        InterA.setStaffID("2290");
        InterA.setSchool("SMMTC");
        InterA.setSalary(10000);
        InterA.setpassportNum("G8990298");
        InterA.setoriginCountry("United Kingdom");
        
        System.out.println("UUM STAFF\n");
        System.out.println("UUM Staff name is " + staffA.getName());
        System.out.println("UUM Staff Staff ID is " + staffA.getStaffID());
        System.out.println("UUM Staff School is " + staffA.getSchool());
        System.out.print("UUM Staff salary is RM ");
        System.out.printf("%.2f%n",staffA.getSalary());
        System.out.println("\nMALAYSIAN UUM STAFF\n");
        System.out.println("MALAYSIAN UUM Staff name is " + MsA.getName());
        System.out.println("MALAYSIAN UUM Staff Staff ID is " + MsA.getStaffID());
        System.out.println("MALAYSIAN UUM Staff School is " + MsA.getSchool());
        System.out.print("MALAYSIAN UUM Staff salary is RM ");
        System.out.printf("%.2f%n", MsA.getSalary());
        System.out.println("Malaysian UUM Staff IC number is " + MsA.geticNum());
        System.out.println("Malaysian UUM Staff residential status is " + MsA.getresidentialStatus());
        System.out.println("\nInternational UUM STAFF\n");
        System.out.println("International UUM Staff name is " + InterA.getName());
        System.out.println("International UUM Staff Staff ID is " + InterA.getStaffID());
        System.out.println("International UUM Staff School is " + InterA.getSchool());
        System.out.print("International UUM Staff salary is RM ");
        System.out.printf("%.2f%n", InterA.getSalary());
        System.out.println("International UUM Staff passport number is " + InterA.getpassportNum());
        System.out.println("International UUM Staff origin country is " + InterA.getoriginCountry());
        
        
    }
}
