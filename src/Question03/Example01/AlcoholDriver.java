/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question03.Example01;

/**
 *
 * @author Chandra Bhanu Tata
 */
public class AlcoholDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassCastException {
        // TODO code application logic here
        System.out.println("Answer for Question number: 03 Example 01"
                + "   Name:- CHANDRA BHANU TATA");
        System.out.println("----------------------------------------------------------");
        Alcohol alcho = new Beer(true, 5.5, "Budwiser");
        Alcohol cohol = alcho;   //implicit conversion parent type will automatically hold child object
        try {
            System.out.println("Alcohol is parent object but calling child object");
            System.out.println(cohol.toString());

            System.out.println("alcho1 is child object but calling childs");
            Alcohol alcho1 = new Alcohol(6.5, "Bud light");
            Beer beer1 = (Beer) alcho; //Explict COnversion of parent to child type
            System.out.println(beer1.toString());
            Beer beer2 = (Beer) alcho1;
            //we get an exception here because we are converting from parent to child
            System.out.println(beer2.toString());
        } catch (ClassCastException e) {
            System.out.println(e);
        }
    }

}
