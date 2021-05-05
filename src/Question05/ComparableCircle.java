;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question05;

/**
 * 
 * @author Chandra Bhanu Tata 
 */

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {

    public ComparableCircle(double radius) {
        super(radius);
    }

    public double parentArea() {
        return Math.round(super.getAreaOfCircle());
    }

    @Override
    public int compareTo(ComparableCircle cCircle) {
        return Double.compare(cCircle.parentArea(), this.parentArea());
    }

}
