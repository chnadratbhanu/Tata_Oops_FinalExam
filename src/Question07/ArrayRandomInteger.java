/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question07;

import java.util.Scanner;

/**
 *
 * @author Chandra Bhanu Tata
 */
public class ArrayRandomInteger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for Question number: 07"
                + "   Name:- CHANDRA BHANU TATA");
        System.out.println("----------------------------------------------------------");
        int[] integers = new int[100];

        for (int i = 0; i < integers.length; i++) {

            integers[i] = (int) (Math.random() * 100 + 1);
        }
        System.out.print("Enter integer value: ");
        Scanner s1 = new Scanner(System.in);
        int index = s1.nextInt();
        try {
            System.out.println("Index of integer at " + index + ": "
                    + integers[index]);
        } catch (Exception excep) {
            System.out.println(excep.getMessage());
        }
    }

}
