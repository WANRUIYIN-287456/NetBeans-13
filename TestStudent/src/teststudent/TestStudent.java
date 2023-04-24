/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teststudent;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class TestStudent {  
public static void main (String [] args) {
	Scanner input = new Scanner(System.in);
        String matricNo;
	double test1,test2;
	
	Student [] studDegree = new Student[3];
	
        for (int i=0; i<3; i++){
        System.out.print("Matric No : ");
        matricNo=input.next();
        System.out.print("Test 1 : ");
        test1=input.nextDouble();
        System.out.print("Test 2 : ");
        test2=input.nextDouble();
        
        studDegree[i] = new Student (matricNo, test1, test2);
        studDegree[i].calculateAverage();
        }
        System.out.println("*************************************");
        System.out.println("\tSTUDENT INFORMATION");
        System.out.println("*************************************");
        System.out.println("Matric No\tAverageMark");

        for (int j=0;j<3;j++){
            System.out.println(studDegree[j].getStudentInfo());
        }




  }//end of main method
}//end of class TestStudent
