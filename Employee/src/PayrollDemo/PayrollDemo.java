/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PayrollDemo;

public class PayrollDemo {

    public static void main(String[] args) {
     
    Employee employee = new Employee();
 
     Payroll pay = new Payroll();
     pay.calculateNetPay();
     pay.printOutput();
     
    }   
}
