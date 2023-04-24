/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.programmingassignment2;

// WAN RUI YIN 287456

import java.text.DecimalFormat;
import java.util.Arrays;


public class StudentOperation {

    private Student [] studArray ;
    private Student stud;
    private int i;
    int matric;
    private String name;
    private String program;
    private String university;
    private double weight;
    private double height;
    private double bmi;
    private String status;
     
    public StudentOperation(){
     studArray = new Student [5];
     stud = new Student(matric,name,program,university,weight,height,bmi,status);
     i=0;
    }
    
    public String calculateBMI(double weight, double height){
        bmi = weight/((height/100)*(height/100));
        String bmi2 = String.format("%.2f",bmi);
        return bmi2;
    }
    
    public String getStatusbmi(double bmi){
        status = null;
        if (bmi > 35.0)
            status = "Severely obese";
        else if(bmi>=30.1 && bmi <=35.1)
            status = "Moderately Obese";
        else if(bmi>=25.1 && bmi <=30.0)
            status = "Overweight";
        else if(bmi>=18.6 && bmi <=25.0)
            status = "Normal weight";
        else if(bmi>=16.0 && bmi <=18.5)
            status = "Underweight";
        else if(bmi<16.0)
            status = "Severely underweight";
        return status;
    }
   
    public void saveRecord(int j, Student stud){
      studArray[j]= stud;
    }
  
   /* public String readAllRecord(){
    String allrecord;
    String record ="";
    
    for(int j=0;j<5;j++){
    record += (j+1) + ". " + studArray[i].toString() + "\n";
    }
    allrecord = "Matric Number\t Name\t\t Program\t University\t Weight\t Height\t BMI\t Status\n" +
            record;
    return allrecord;
    }
   */ 
  
    /*public String readAllRecord(int j){
    String record = studArray[j].toString();
    return record;
    }
   */
    
    public String readAllRecord(int j){
    String record = String.format("%-15s%-17s%-16s%-15s%-11s%-10s%-11s%-10s%n",Integer.toString(studArray[j].getMatric_number()),studArray[j].getName(),
                                  studArray[j].getProgram(), studArray[j].getUniversity(), Double.toString(studArray[j].getWeight()), 
                                  Double.toString(studArray[j].getHeight()), Double.toString(studArray[j].getBmi()), studArray[j].getStatus());
    return record;
    }
    
    public int searchRecord(int matricno){
        int index;
      
	for(index = 0; index < 5; index++){
	    if(studArray[index].getMatric_number()== matricno)
	      return index;                
	}
        return -1;
    }
    // 
}
        
