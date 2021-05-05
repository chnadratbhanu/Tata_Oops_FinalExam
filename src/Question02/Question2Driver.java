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
public class Question2Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        System.out.println("Answer for Question number: 02   Name:- CHANDRA BHANU TATA");
        System.out.println("----------------------------------------------------------");
        GeometricObject[] geometricObjects = new GeometricObject[5];

        geometricObjects[0] = new Square(3.8, true);
        geometricObjects[1] = new Square(5.4, false);
        geometricObjects[2] = new Square(6.4, false);
        geometricObjects[3] = new Square(7.6, true);
        geometricObjects[4] = new Square(8.9, true);

        for (GeometricObject geometricObject : geometricObjects) {
            System.out.println("Area: " + geometricObject.calculateArea());
            if (geometricObject.isColorFillable() == true) {
                Square square = (Square) geometricObject;
                square.howToColor();
            }
            System.out.println("**********************************");
        }

    }

}
