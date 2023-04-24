/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.q1main;

/**
 *
 * @author User
 */
public class QuestionOne {
    private int count;
	
        QuestionOne(){
        count = 1;
        }
       /*  same as constructor QuestionOne
	public void init(){
		count = 1;
	}
*/
	public void increment() {
		count = count + 1;
	}
	public int getCount() {
		return count;

}
}