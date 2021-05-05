/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question08.Example01;

/**
 *
 * @author Chandra Bhanu Tata
 */
public class Exception {

    public static void main(String[] args) {
        System.out.println("Answer for Question number: 08 Example 01"
                + "   Name:- CHANDRA BHANU TATA");
        System.out.println("----------------------------------------------------------");
        System.out.println("CHANDRA BHANU TATA");
        try {
            String techName = "Chekumukhi Exam";
            int x[] = {0, 1, 2, 3, 4, 5};
            int len = techName.length();
            System.out.println("String length: " + len);
            int y = 6;
            System.out.println(x[y]);
        } catch (NullPointerException | ArrayIndexOutOfBoundsException npe) {
            System.out.println("Exception is caught");
            System.out.println(npe.toString());
        }
    }
}
