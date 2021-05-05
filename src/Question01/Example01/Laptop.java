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
public class Laptop extends Gadgets implements GadgetsInterface {

    private int year;

    public Laptop(int year, String gadgetName) {
        super(gadgetName);
        this.year = year;
    }
   

    @Override
    public int getGadgetYear() {
        return this.year;
    }

    @Override
    public String getGadgetBrand() {
        return "HP";
    }

    @Override
    public String getGadgetType() {
        return "Personal Laptop";
    }

    public String getMyParentToString() {
        return super.toString();
    }

    @Override
    public String toString() {
        return "The Gadget Type is " + this.getGadgetType()
                + ". Brand is " + this.getGadgetBrand()
                + ". Year is " + this.getGadgetYear() + ". Its short form is "
                + this.gadgetsNameShortForm();

    }
//
//    @Override
//    String gadgetsNameShortForm() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    @Override
    String gadgetsNameShortForm() {
        return super.getGadgetName().substring(0, 2); //To change body of generated methods, choose Tools | Templates.
    }

    

}
