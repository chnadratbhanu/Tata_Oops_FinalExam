/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question09.Example01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Chandra Bhanu Tata
 */
public class Throws {

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Answer for Question number: 09 Example 01"
                + "   Name:- CHANDRA BHANU TATA");
        System.out.println("----------------------------------------------------------");

        Scanner sc = new Scanner(new File("chandra.txt"));
        while (sc.hasNext()) {
            System.out.println(sc.nextLine());
        }

    }
}
