/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.customerbill;

/**
 *
 * @author User
 */
public class CustomerBill {

   private String custType;
    private String acctNum;
    private int numOfConnections;
    private int numOfPremChannels;
 // TODO: add constructor method code here:
    public CustomerBill(String Ct, String An, int Noc, int Nop){
    custType = Ct;
    acctNum = An;
    numOfConnections = Noc;
    numOfPremChannels = Nop;       
}

// TODO: add calcResidentialCustomer() method code here:
   public double calcResidentialCustomer(){ 
       double totalRC;
       totalRC = 20 + (7.5 * numOfPremChannels);
       return totalRC;
   }

// TODO: add calcBusinessCustomer() method code here:
    public double calcBusinessCustomer(){ 
        double totalBC;
        if(numOfConnections <= 10)
            totalBC = 75 + (20 * numOfPremChannels);
        else
            totalBC = 75 + ((numOfConnections-10)*5) + (20 * numOfPremChannels);
        return totalBC;
    }
    
    public String toString() {
        String billInfo = "";
        double charge = 0.0;
        if (custType.equals("Residential")) {
         charge = calcResidentialCustomer();
         billInfo = "Account Number: " + acctNum + "\n"
             + "Number of premium channels = "+numOfPremChannels+ "\n"
             + "Amount Due = RM"+charge;
        } else {
           charge = calcBusinessCustomer();
           billInfo = "Account Number: " + acctNum + "\n"
           + "Number of service connections = "+numOfConnections+ "\n"
           + "Number of premium channels = "+numOfPremChannels+ "\n"
           + "Amount Due = RM"+charge;  
        }
        return billInfo;
    }

}
