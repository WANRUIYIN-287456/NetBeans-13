/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.q1main;

/**
 *
 * @author User
 */
public class Q1Main {
// EXE 31 Q1
    public static void main(String[] args) {
       	        QuestionOne q1;
	 	q1 = new QuestionOne();
		//q1.init();  //this one no need, class directly go to QuestionOne
		q1.increment();
		q1.increment();
		System.out.println(q1.getCount());

    }
}
