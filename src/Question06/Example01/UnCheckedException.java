/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question06.Example01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Chandra Bhanu Tata
 */
public class UnCheckedException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        System.out.println("Answer for Question number: 06 Example 01"
                + "   Name:- CHANDRA BHANU TATA");
        System.out.println("----------------------------------------------------------");

        Scanner scan = new Scanner(new File("chandra.txt"));

        while (scan.hasNext()) {
            System.out.println(scan.nextLine());
        }
    }

}
