/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PayrollDemo;
public class Payroll {
    
     private double net_pay; 
     
    public void calculateNetPay(){
        Employee employee = new Employee();
        employee.input();
        net_pay = employee.getgross_pay() - employee.getstate_tax() - employee.getfederal_tax();
    } 
    
    public void printOutput(){
       System.out.printf("\nNet pay is : RM" + "%.2f",net_pay);  
    }
    
}
