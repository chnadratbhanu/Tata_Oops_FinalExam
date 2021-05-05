/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question10.Example01;

/**
 *
 * @author Chandra Bhanu Tata
 */
public class CalculateProduct {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for Question number: 10 Example 01"
                + "   Name:- CHANDRA BHANU TATA");
        System.out.println("----------------------------------------------------------");

        System.out.println(product(10));
    }

    public static int product(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num * product(num);
        }

    }

}
