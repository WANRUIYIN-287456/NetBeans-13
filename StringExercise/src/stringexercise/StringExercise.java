/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringexercise;

/**
 *
 * @author User
 */
public class StringExercise {
// LAB EXERCISE 2A PREDEFINED CLASS
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
 String college = new String ("College of Arts and Sciences");
 String x = ",";
 String town = new String ("UUM Sintok"); // part (a)
 int stringLength;
 String change1, change2, change3;
 stringLength = college.length();// part (b)
 System.out.println (college + " contains " + stringLength + " characters.");
 change1 = college.toUpperCase(); // part (c)
 System.out.println ("The string is all in upper case: " + change1);
 change2 = change1.replace("O","O").replaceAll("C", "*").replaceAll("L", "*").replaceAll("E", "*")
         .replaceAll("G", "*").replaceAll("F", "*").replaceAll("A", "*").replaceAll("R", "*")
         .replaceAll("T", "*").replaceAll("S", "*").replaceAll("N", "*").replaceAll("D", "*").
         replaceAll("I", "*"); // part (d)
System.out.println ("All characters except capital O's are replaced with the asterisk character: " + change2);
 change3 =college.concat(x).concat(town); // part (e)
                                          // change3 =college.(" " + town);
 System.out.println ("The final string is " + change3);

 }
}  

