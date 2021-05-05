/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question05;

/**
 * 
 * @author Chandra Bhanu Tata 
 */

public class Circle {

    private double rad;
   

    public Circle(double rad) {
        this.rad= rad;
    }

    public double getAreaOfCircle() {
        return Math.PI * rad* rad;
    }

}
