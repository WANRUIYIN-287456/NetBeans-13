/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PayrollDemo;
import java.util.Scanner;
public class Employee {
    
   Scanner console = new Scanner(System.in);
    private int employee_id_number;
    private double gross_pay;
    private double state_tax;
    private double federal_tax;
    
    public void input(){
        
       System.out.print("Enter your employee ID number:");
       employee_id_number = console.nextInt();
       System.out.print("Enter your Gross Pay         :RM ");
       gross_pay = console.nextDouble();
       System.out.print("Enter your State Tax         :RM ");
       state_tax = console.nextDouble();
       System.out.print("Enter your Federal Tax       :RM ");
       federal_tax = console.nextDouble();   
       
    }
    
    public int getemployee_id_number(){
        return employee_id_number;
    }
    
    public double getgross_pay(){
        return gross_pay;
    }
    
     public double getstate_tax(){
        return state_tax;
    }
     
    public double getfederal_tax(){
        return federal_tax;
    }
}
