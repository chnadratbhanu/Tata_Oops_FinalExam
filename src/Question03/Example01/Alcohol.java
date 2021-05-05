/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question03.Example01;

/**
 *
 * \
 */
public class Alcohol {

    private double alcoholPercentage;
    private String alcoholType;

    public Alcohol(double alcoholPercentage, String alcoholType) {
        this.alcoholPercentage = alcoholPercentage;
        this.alcoholType = alcoholType;
    }

    public double getAlcoholPercentage() {
        return alcoholPercentage;
    }

    public String getAlcoholType() {
        return alcoholType;
    }

    @Override
    public String toString() {
        return "The Alcohol Percentage in " + this.getAlcoholType()
                + " is " + this.getAlcoholPercentage();
    }

}
