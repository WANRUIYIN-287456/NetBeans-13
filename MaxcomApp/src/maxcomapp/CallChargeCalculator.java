/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maxcomapp;

/**
 *
 * @author User
 */

public class CallChargeCalculator {
    double charge;

    public double computeCharge(int duration, int category) {
        double rate;
        if (category== 1) {
            rate =0.07;
        } else if (category== 2) {
            rate = 0.12;
        } else {
            rate = 0.05;
        }
        charge = duration * rate;
        return charge;
    }
}
