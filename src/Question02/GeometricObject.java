/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question02;

/**
 *
 * @author Chandra Bhanu Tata
 */
public abstract class GeometricObject {

    private boolean colorFillable;

    public GeometricObject(boolean colorFillable) {
        this.colorFillable = colorFillable;
    }

    public boolean isColorFillable() {
        return colorFillable;
    }

    public abstract double calculateArea();
}
