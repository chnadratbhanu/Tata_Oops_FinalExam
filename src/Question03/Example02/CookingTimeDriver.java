/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question03.Example02;

/**
 *
 * @author Chandra Bhanu Tata
 */
public class CookingTimeDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

// TODO code application logic here
        System.out.println("Answer for Question number: 03 Example 02"
                + "   Name:- CHANDRA BHANU TATA");
        System.out.println("----------------------------------------------------------");
        double cookingTime = 10;
        System.out.println("*************************************************");
        System.out.println("Explicit Type Casting");
        System.out.println("The value of double before conversion is "
                + cookingTime);

        int cookingInt = (int) cookingTime;
        //explicit conversion of double to  int
        System.out.println("The value of int after conversion is "
                + cookingInt);

        int chefCost = 5000;

        System.out.println("*************************************************");
        System.out.println("Implicit Type Casting");
        System.out.println("The value of int before conversion " + chefCost);
        double playersCostDouble = chefCost;
        //implicit conversion int directly converted to double,
        // becuase double has higher datatype.

        System.out.println("The value of double after conversion "
                + playersCostDouble);
        System.out.println("*************************************************");

    }
}
