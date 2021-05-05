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
public class GadgetsDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Answer for Question number: 01 Example 01"
                + "   Name:- CHANDRA BHANU TATA");
        System.out.println("----------------------------------------------------------");
        Laptop lap = new Laptop(2007, "HP probook core i5");
        System.out.println(lap);
        System.out.println(lap.getMyParentToString());
    }
}
