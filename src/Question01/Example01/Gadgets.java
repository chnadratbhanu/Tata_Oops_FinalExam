/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question01.Example01;

/**
 *
 * @author Chandra Bhanu Tata
 */
public abstract class Gadgets {

    private String gadgetsName;

    public Gadgets(String gadgetsName) {
        this.gadgetsName = gadgetsName;
    }

    String getGadgetName() {
        return this.gadgetsName;
    }

    abstract String gadgetsNameShortForm();

    @Override
    public String toString() {
        return "The Gadget Name is " + this.getGadgetName()
                + " And its short form is " + this.gadgetsNameShortForm();
    }
}
